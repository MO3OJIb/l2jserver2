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
package script.template.actor.npc.monster;

import com.google.inject.Inject;
import com.l2jserver.model.id.template.provider.ItemTemplateIDProvider;
import com.l2jserver.model.id.template.provider.NPCTemplateIDProvider;
import com.l2jserver.model.template.npc.MonsterNPCTemplate;
import com.l2jserver.model.world.Actor.ActorSex;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class HikoroTemplate extends MonsterNPCTemplate {
	public static final int ID = 18630;

	@Inject
	protected HikoroTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Hikoro";
		this.serverSideName = false;
		this.title = "Panuka";
		this.serverSideTitle = false;
		this.collisionRadius = 30.00;
		this.collisionHeight = 39.00;
		this.level = 61;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 22092.824363540800000;
		this.maxMP = 1066.800000000000000;
		this.hpRegeneration = 15.000000000000000;
		this.mpRegeneration = 2.700000000000000;
		this.experience = 63183;
		this.sp = 5562;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(3);
		this.leftHand = null;
		this.enchantLevel = 0;
		this.targetable = true;
		this.showName = true;
		this.dropHerbGroup = 0;
		this.baseAttributes = true;
		
		attributes.intelligence = 21;
		attributes.strength = 40;
		attributes.concentration = 43;
		attributes.mentality = 20;
		attributes.dexterity = 30;
		attributes.witness = 20;
		attributes.physicalAttack = 501.08068;
		attributes.magicalAttack = 342.17315;
		attributes.physicalDefense = 252.49346;
		attributes.magicalDefense = 184.76376;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 60.00000;
		attributes.runSpeed = 150.00000;
	}
}