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

package com.dynaLogic.miscPlus;

import com.dynaLogic.miscPlus.init.ModBlocks;
import com.dynaLogic.miscPlus.init.ModItems;
import com.dynaLogic.miscPlus.reference.Ref;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by King_INF3RN0 on 5/5/2015.
 */
@Mod(version = Ref.VERSION, modid = Ref.MOD_ID, name = Ref.MOD_NAME)
public class MiscPlus
{
    @Mod.Instance(Ref.MOD_ID)
    public static MiscPlus instance;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
    }
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }
}
