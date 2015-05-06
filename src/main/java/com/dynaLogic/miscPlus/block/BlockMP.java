package com.dynaLogic.miscPlus.block;

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
    }

    @Override
    public Block setUnlocalizedName(String name) {
        return super.setUnlocalizedName(name);
    }
}
