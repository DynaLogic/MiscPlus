package com.dynaLogic.miscPlus.init;

import com.dynaLogic.miscPlus.item.ItemMP;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
public class ModItems
{
    public static Item itemMP = new ItemMP();


    public static void init()
    {
        GameRegistry.registerItem(itemMP,"ItemMP");
    }
}
