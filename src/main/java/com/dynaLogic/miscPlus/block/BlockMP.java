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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
public class BlockMP extends Block
{
    public BlockMP(Material material)
    {
        super(material);
        this.setUnlocalizedName("blockMP");
        this.setCreativeTab(TabMP.MP_TAB);
        this.setHardness(60.0F);
    }

    @Override
    public Block setUnlocalizedName(String name)
    {
        return super.setUnlocalizedName(name);
    }
}
