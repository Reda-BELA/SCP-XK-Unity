package gus.scpua.entity.living.scp.scp1499;


import gus.scpua.entity.living.scp.scp1499.EntitySCP1499;
import gus.scpua.entity.living.scp.scp1499.Model1499;
import gus.scpua.scpua;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Render1499 extends RenderLiving<EntitySCP1499> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(scpua.MODID + ":textures/entity/1499.png");

    public Render1499(RenderManager manager) {
        super(manager, new Model1499(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySCP1499 entity) {
        return TEXTURE;
    }
}
