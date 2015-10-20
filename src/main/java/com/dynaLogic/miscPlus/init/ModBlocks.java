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

package com.dynaLogic.miscPlus.init;

import com.dynaLogic.miscPlus.MiscPlus;
import com.dynaLogic.miscPlus.block.*;
import com.dynaLogic.miscPlus.reference.Ref;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.naming.Reference;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
public class ModBlocks
{
    public static Block blockMP = new BlockMP(Material.rock);
    public static Block ceramic = new Ceramic();
    public static Block obsidianBrick = new ObsidianBrick();
    public static Block soil = new Soil();
    public static Block smoothObsidian = new SmoothObsidian();
    public static Block denseGlowstone = new DenseGlowstone();


    public static void init()
    {
        GameRegistry.registerBlock(blockMP,"BlockMP");
        GameRegistry.registerBlock(ceramic,"Ceramic");
        GameRegistry.registerBlock(obsidianBrick, "ObsidianBrick");
        GameRegistry.registerBlock(soil,"Soil");
        GameRegistry.registerBlock(smoothObsidian,"SmoothObsidian");
        GameRegistry.registerBlock(denseGlowstone,"DenseGlowstone");

    }

    public static void register()
    {
        GameRegistry.registerBlock(blockMP, blockMP.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(ceramic, ceramic.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(obsidianBrick, obsidianBrick.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(soil, soil.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(smoothObsidian, smoothObsidian.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(denseGlowstone, denseGlowstone.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block)
    {
        registerRenders(blockMP);
        registerRenders(ceramic);
        registerRenders(obsidianBrick);
        registerRenders(soil);
        registerRenders(smoothObsidian);
        registerRenders(denseGlowstone);
    }

    public static void registerRenders(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }



}
