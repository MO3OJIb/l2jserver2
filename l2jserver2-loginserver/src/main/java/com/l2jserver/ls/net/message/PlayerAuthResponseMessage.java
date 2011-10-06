/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.ls.net.message;

import com.l2jserver.ls.net.Message;

/**
 * @author -Wooden-
 * 
 */
public class PlayerAuthResponseMessage implements Message {
	private static final long serialVersionUID = -2769385090218023613L;

	private String account;
	private boolean authed;

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the authed
	 */
	public boolean isAuthed() {
		return authed;
	}

	/**
	 * @param authed
	 *            the authed to set
	 */
	public void setAuthed(boolean authed) {
		this.authed = authed;
	}
}