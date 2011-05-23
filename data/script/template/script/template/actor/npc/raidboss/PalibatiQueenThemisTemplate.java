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
public class PalibatiQueenThemisTemplate extends RaidBossNPCTemplate {
	public static final int ID = 25252;

	@Inject
	protected PalibatiQueenThemisTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Palibati Queen Themis";
		this.serverSideName = false;
		this.title = "Raid Boss";
		this.serverSideTitle = false;
		this.collisionRadius = 37.00;
		this.collisionHeight = 98.00;
		this.level = 70;
		this.sex = ActorSex.FEMALE;
		this.attackRange = 40;
		this.maxHP = 373386.071242416000000;
		this.maxMP = 1345.800000000000000;
		this.hpRegeneration = 117.684362428860000;
		this.mpRegeneration = 2.700000000000000;
		this.experience = 4596479;
		this.sp = 802604;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(234);
		this.leftHand = null;
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
		attributes.physicalAttack = 2154.88112;
		attributes.magicalAttack = 717.40387;
		attributes.physicalDefense = 887.74791;
		attributes.magicalDefense = 433.08000;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 8;
		attributes.walkSpeed = 70.00000;
		attributes.runSpeed = 160.00000;
	}
}