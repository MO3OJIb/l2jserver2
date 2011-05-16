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
package com.l2jserver.service.blowfish;

import java.util.Random;

import com.l2jserver.service.AbstractService;
import com.l2jserver.service.ServiceStartException;
import com.l2jserver.service.ServiceStopException;

public class PseudoRandomBlowfishKeygenService extends AbstractService
		implements BlowfishKeygenService {
	private Random random;

	@Override
	public void start() throws ServiceStartException {
		random = new Random();
	}

	@Override
	public byte[] generate() {
		final byte[] key = new byte[16];
		// randomize the 8 first bytes
		for (int i = 0; i < key.length; i++) {
			key[i] = (byte) random.nextInt(255);
		}

		// the last 8 bytes are static
		key[8] = (byte) 0xc8;
		key[9] = (byte) 0x27;
		key[10] = (byte) 0x93;
		key[11] = (byte) 0x01;
		key[12] = (byte) 0xa1;
		key[13] = (byte) 0x6c;
		key[14] = (byte) 0x31;
		key[15] = (byte) 0x97;
		return key;
	}

	@Override
	public void stop() throws ServiceStopException {
		random = null;
	}
}
