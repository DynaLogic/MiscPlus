package com.dynaLogic.miscPlus.init;

import com.dynaLogic.miscPlus.block.BlockMP;
import com.dynaLogic.miscPlus.block.Ceramic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
public class ModBlocks
{
    public static Block blockMP = new BlockMP(Material.rock);
    public static Block ceramic = new Ceramic();


    public static void init()
    {
        GameRegistry.registerBlock(blockMP,"BlockMP");
        GameRegistry.registerBlock(ceramic,"Ceramic");

    }



}
