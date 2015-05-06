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
