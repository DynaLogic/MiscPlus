/*
 * Copyright (C) 2015. Adam Orand
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.dynaLogic.miscPlus.block;

import com.dynaLogic.miscPlus.reference.TabMP;
import net.minecraft.block.material.Material;

/**
 * Created by King_INF3RN0 on 5/7/2015.
 */
public class ObsidianBrick extends BlockMP
{
    public ObsidianBrick()
    {
        super(Material.rock);
        this.setUnlocalizedName("obsidianBrick");
        this.setHardness(60.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeStone);
        this.setResistance(18000.0F);
        this.setCreativeTab(TabMP.MP_TAB);
    }
}
