package gus.scpua.init;

import gus.scpua.entity.living.scp.scp049.EntitySCP049;
import gus.scpua.entity.living.scp.scp999.EntitySCP999;
import gus.scpua.scpua;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities() {
        int entityID = 0;
        registerEntity("scp049", EntitySCP049.class, entityID++, 15, 808080, 404040);
        registerEntity("scp999", EntitySCP999.class, entityID++, 15, 808080, 404040);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(scpua.MODID + ":" + name), entity, name, id, scpua.instance, range, 1, true, color1, color2);
    }

    private static void registerNonMobEntity() {

    }
}
