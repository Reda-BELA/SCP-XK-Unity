package gus.scpua.util.handlers;

import gus.scpua.init.BlockInit;
import gus.scpua.init.EntityInit;
import gus.scpua.init.ItemInit;
import gus.scpua.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class XKRegistryHandler {
    //Item Register
    @SubscribeEvent
    public static void onItemRegtister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    //Block Register
    @SubscribeEvent
    public static void onBlockRegtister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegister(ModelRegistryEvent event) {
        XKRenderHandler.registerEntityRenders();
        for (Item item : ItemInit.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }

        for (Block block : BlockInit.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }
        }
    }

    //preInit Registries
    public static void preInitRegistries(FMLPreInitializationEvent event) {
        XKConfigHandler.registerConfig(event);
        EntityInit.registerEntities();
    }

    //Init Registries
    public static void initRegistries(FMLInitializationEvent event) {
        new XKSoundHandler();
    }

    //PostInit Registries
    public static void postInitRegistries(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new XKEventHandler());
    }

}
