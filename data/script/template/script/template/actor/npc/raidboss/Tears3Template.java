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
package script.template.actor.npc.raidboss;

import com.google.inject.Inject;
import com.l2jserver.model.id.template.provider.ItemTemplateIDProvider;
import com.l2jserver.model.id.template.provider.NPCTemplateIDProvider;
import com.l2jserver.model.template.npc.RaidBossNPCTemplate;
import com.l2jserver.model.world.Actor.ActorSex;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class Tears3Template extends RaidBossNPCTemplate {
	public static final int ID = 25716;

	@Inject
	protected Tears3Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Tears";
		this.serverSideName = false;
		this.title = "Ice";
		this.serverSideTitle = false;
		this.collisionRadius = 20.00;
		this.collisionHeight = 27.50;
		this.level = 84;
		this.sex = ActorSex.FEMALE;
		this.attackRange = 40;
		this.maxHP = 1360985.813637900000000;
		this.maxMP = 18120.000000000000000;
		this.hpRegeneration = 154.089581103435000;
		this.mpRegeneration = 30.000000000000000;
		this.experience = 2039317;
		this.sp = 1217980;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(9638);
		this.leftHand = itemProvider.createID(9638);
		this.enchantLevel = 0;
		this.targetable = true;
		this.showName = true;
		this.dropHerbGroup = 0;
		this.baseAttributes = true;
		
		attributes.intelligence = 76;
		attributes.strength = 60;
		attributes.concentration = 57;
		attributes.mentality = 80;
		attributes.dexterity = 73;
		attributes.witness = 70;
		attributes.physicalAttack = 5380.73978;
		attributes.magicalAttack = 3682.33073;
		attributes.physicalDefense = 644.16101;
		attributes.magicalDefense = 345.95343;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 60.00000;
		attributes.runSpeed = 180.00000;
	}
}