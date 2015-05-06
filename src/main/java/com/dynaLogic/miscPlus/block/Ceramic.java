package com.dynaLogic.miscPlus.block;

import com.dynaLogic.miscPlus.reference.TabMP;
import net.minecraft.block.material.Material;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
public class Ceramic extends BlockMP
{
    public Ceramic()
    {
        super(Material.glass);
        this.setCreativeTab(TabMP.MP_TAB);
        this.setUnlocalizedName("ceramic");
        this.setStepSound(soundTypeGlass);

    }

}