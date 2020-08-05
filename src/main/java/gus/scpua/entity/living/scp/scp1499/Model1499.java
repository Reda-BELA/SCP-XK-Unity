package gus.scpua.entity.living.scp.scp1499;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Model1499 extends ModelBase  {
    public  ModelRenderer All;
    public  ModelRenderer Head;
    public  ModelRenderer RightSide;
    public  ModelRenderer LeftSide;
    public  ModelRenderer Body;
    public  ModelRenderer Torso;
    public  ModelRenderer LeftLeg;
    public  ModelRenderer LowerLeg;
    public  ModelRenderer RightLeg;
    public  ModelRenderer LowerLeg2;
    public  ModelRenderer RightArm;
    public  ModelRenderer LowerArm;
    public  ModelRenderer LeftArm;
    public  ModelRenderer LowerArm2;

    public Model1499() {
        textureWidth = 64;
        textureHeight = 64;

        All = new ModelRenderer(this);
        All.setRotationPoint(0.275F, 24.075F, 0.0F);


        Head = new ModelRenderer(this);
        Head.setRotationPoint(-0.25F, -23.0F, 0.95F);
        All.addChild(Head);
        Head.setTextureOffset(0, 0);
        Head.addBox(-4.0F, -8.0F, -3.45F, 8.0F, 8.0F, 7.0F, 0.0F, false);

        RightSide = new ModelRenderer(this);
        RightSide.setRotationPoint(0.0F, 0.0F, -4.75F);
        Head.addChild(RightSide);
        setRotationAngle(RightSide, 0.0F, 0.2443F, 0.0F);
        RightSide.setTextureOffset(0, 16);
        RightSide.addBox(-4.3849F, -8.0F, 0.1085F, 4.0F, 8.0F, 3.0F, -0.02F, false);

        LeftSide = new ModelRenderer(this);
        LeftSide.setRotationPoint(0.55F, 0.0F, -4.5F);
        Head.addChild(LeftSide);
        setRotationAngle(LeftSide, 0.0F, -0.2443F, 0.0F);
        LeftSide.setTextureOffset(16, 16);
        LeftSide.addBox(-0.2256F, -8.0F, 0.0097F, 4.0F, 8.0F, 3.0F, -0.02F, false);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(-0.25F, -17.625F, 0.0F);
        All.addChild(Body);
        Body.setTextureOffset(32, 11);
        Body.addBox(-3.5F, -1.125F, -1.5F, 7.0F, 7.0F, 3.0F, 0.0F, false);

        Torso = new ModelRenderer(this);
        Torso.setRotationPoint(0.0F, 0.625F, 0.0F);
        Body.addChild(Torso);
        setRotationAngle(Torso, -0.1484F, 0.0F, 0.0F);
        Torso.setTextureOffset(30, 1);
        Torso.addBox(-4.0F, -6.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(1.5F, -11.75F, 0.0F);
        All.addChild(LeftLeg);
        setRotationAngle(LeftLeg, -0.0705F, -0.1395F, 0.0049F);
        LeftLeg.setTextureOffset(13, 32);
        LeftLeg.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        LowerLeg = new ModelRenderer(this);
        LowerLeg.setRotationPoint(-0.0012F, 5.7506F, -0.0174F);
        LeftLeg.addChild(LowerLeg);
        setRotationAngle(LowerLeg, 0.0705F, 0.0F, 0.0F);
        LowerLeg.setTextureOffset(13, 41);
        LowerLeg.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, -0.02F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-2.075F, -11.75F, 0.0F);
        All.addChild(RightLeg);
        setRotationAngle(RightLeg, -0.0705F, 0.1393F, -0.0098F);
        RightLeg.setTextureOffset(0, 32);
        RightLeg.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        LowerLeg2 = new ModelRenderer(this);
        LowerLeg2.setRotationPoint(0.0F, 6.0F, 0.0F);
        RightLeg.addChild(LowerLeg2);
        setRotationAngle(LowerLeg2, 0.0705F, 0.0F, 0.0F);
        LowerLeg2.setTextureOffset(0, 41);
        LowerLeg2.addBox(-1.4976F, -0.25F, -1.4997F, 3.0F, 6.0F, 3.0F, -0.02F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-4.25F, -20.9F, 0.25F);
        All.addChild(RightArm);
        setRotationAngle(RightArm, 0.0F, 0.0F, 0.1614F);
        RightArm.setTextureOffset(36, 22);
        RightArm.addBox(-3.0182F, -2.0629F, -0.75F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        LowerArm = new ModelRenderer(this);
        LowerArm.setRotationPoint(-1.556F, 4.1713F, 0.5F);
        RightArm.addChild(LowerArm);
        setRotationAngle(LowerArm, 0.0F, 0.0F, 0.4363F);
        LowerArm.setTextureOffset(36, 31);
        LowerArm.addBox(-1.7414F, -0.991F, -1.25F, 3.0F, 6.0F, 3.0F, -0.02F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(3.75F, -20.9F, 0.5F);
        All.addChild(LeftArm);
        setRotationAngle(LeftArm, 0.0F, 0.0F, -0.1614F);
        LeftArm.setTextureOffset(49, 22);
        LeftArm.addBox(-0.0182F, -2.0629F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        LowerArm2 = new ModelRenderer(this);
        LowerArm2.setRotationPoint(1.4818F, 3.9371F, 0.5F);
        LeftArm.addChild(LowerArm2);
        setRotationAngle(LowerArm2, 0.0F, 0.0F, -0.4363F);
        LowerArm2.setTextureOffset(49, 31);
        LowerArm2.addBox(-1.3712F, -0.6915F, -1.5F, 3.0F, 6.0F, 3.0F, -0.02F, false);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        All.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}