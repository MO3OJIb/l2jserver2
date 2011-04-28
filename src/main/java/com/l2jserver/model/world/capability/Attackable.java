package com.l2jserver.model.world.capability;

import com.l2jserver.model.world.AbstractObject;

/**
 * Defines an {@link AbstractObject} that can receive attacks from an
 * {@link Attacker}.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public interface Attackable extends WorldCapability {
	void receiveAttack(Attacker attacker);
}
