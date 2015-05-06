package com.dynaLogic.miscPlus.reference;

import com.dynaLogic.miscPlus.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
public class TabMP
{
    public static CreativeTabs MP_TAB = new CreativeTabs(Ref.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.blockMP);
        }
    };
}
