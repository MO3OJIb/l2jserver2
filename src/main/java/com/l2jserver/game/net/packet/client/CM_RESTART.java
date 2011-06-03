/*
 * This file is part of l2jserver <l2jserver.com>.
 *
 * l2jserver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.game.net.packet.client;

import org.jboss.netty.buffer.ChannelBuffer;

import com.google.inject.Inject;
import com.l2jserver.db.dao.CharacterDAO;
import com.l2jserver.game.net.Lineage2Connection;
import com.l2jserver.game.net.packet.AbstractClientPacket;
import com.l2jserver.game.net.packet.server.SM_CHAR_LIST;
import com.l2jserver.game.net.packet.server.SM_CHAR_RESTART;
import com.l2jserver.service.game.character.CharacterService;
import com.l2jserver.service.game.spawn.NotSpawnedServiceException;

/**
 * Requests the list of characters to be displayed in the lobby. The list of
 * characters is sent to the client.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class CM_RESTART extends AbstractClientPacket {
	/**
	 * The packet OPCODE
	 */
	public static final int OPCODE = 0x57;

	/**
	 * The {@link CharacterService}
	 */
	private final CharacterService charService;
	/**
	 * The {@link CharacterDAO}
	 */
	private final CharacterDAO charDao;

	@Inject
	public CM_RESTART(CharacterService charService, CharacterDAO charDao) {
		this.charService = charService;
		this.charDao = charDao;
	}

	@Override
	public void read(Lineage2Connection conn, ChannelBuffer buffer) {
	}

	@Override
	public void process(final Lineage2Connection conn) {
		try {
			charService.leaveWorld(conn.getCharacter());
		} catch (NotSpawnedServiceException e) {
			conn.sendActionFailed();
			return;
		}
		conn.setCharacterID(null);
		conn.write(SM_CHAR_RESTART.ok());
		conn.write(SM_CHAR_LIST.fromL2Session(conn.getSession(),
				charDao.selectByAccount(conn.getSession().getAccountID())));
	}
}