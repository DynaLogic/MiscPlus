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
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

import java.util.Random;

/**
 * Created by King_INF3RN0 on 5/10/2015.
 */
public class DenseGlowstone extends BlockGlowstone
{

    public DenseGlowstone()
    {
        super(Material.glass);
        this.setUnlocalizedName("denseGlowstone");
        this.setCreativeTab(TabMP.MP_TAB);
        this.setStepSound(soundTypeGlass);
        this.setLightLevel(1.0F);
        this.setHardness(0.5F);
    }

    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
    }

    public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(3);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.glowstone_dust;
    }


}
