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

import com.dynaLogic.miscPlus.item.ItemMP;
import com.dynaLogic.miscPlus.reference.Ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
public class ModItems
{
    public static Item itemMP = new ItemMP();
    private static Item item;


    public static void init()
    {
        GameRegistry.registerItem(itemMP,"ItemMP");
    }

    public static void register()
    {
        GameRegistry.registerItem(itemMP,"ItemMP");
    }

    public static void registerRenders()
    {

    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
