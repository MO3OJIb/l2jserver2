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
package com.l2jserver.service.game.chat.channel;

import com.l2jserver.model.id.object.CharacterID;
import com.l2jserver.service.game.chat.ChatBanActiveChatServiceException;

/**
 * The {@link ChatChannel} object is used to send messages to a channel.
 * <p>
 * Note that this is a base for all types of channel.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 * @see PrivateChatChannel
 * @see PublicChatChannel
 */
public interface ChatChannel {
	/**
	 * Sends a message to this channel
	 * 
	 * @param sender
	 *            the character sending the message
	 * @param message
	 *            the message to be sent
	 * @throws ChatBanActiveChatServiceException
	 *             if <tt>sender</tt> is banned from chatting
	 */
	void send(CharacterID sender, String message)
			throws ChatBanActiveChatServiceException;

	/**
	 * Adds a {@link ChatChannelListener} that will be notified once a message
	 * has been received.
	 * 
	 * @param listener
	 *            the listener
	 */
	void addChatChannelListener(ChatChannelListener listener);

	/**
	 * Removes a {@link ChatChannelListener}.
	 * 
	 * @param listener
	 *            the listener
	 */
	void removeChatChannelListener(ChatChannelListener listener);
}