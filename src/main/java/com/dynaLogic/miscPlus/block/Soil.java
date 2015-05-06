package com.dynaLogic.miscPlus.block;

import com.dynaLogic.miscPlus.reference.TabMP;
import net.minecraft.block.material.Material;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
public class Soil extends BlockMP
{
    public Soil()
    {
        super(Material.ground);
        this.setUnlocalizedName("soil");
        this.setCreativeTab(TabMP.MP_TAB);
        this.setStepSound(soundTypeGravel);
    }
}
