package gus.scpua.objects.blocks.custom;

import gus.scpua.init.blocks.XKUnity;
import gus.scpua.objects.blocks.BlockBase;
import gus.scpua.util.handlers.XKConfigHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Block610 extends BlockBase {
    @Override public boolean canSustainLeaves(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos){ return true; }

    public Block610(int whatClass, String name, Material material, int inv) {
        super(whatClass, name, material, inv);

        setHarvestLevel("shovel", 1);

        //Enable Spread based on config
        if (XKConfigHandler.SPREAD_610) setTickRandomly(true);
        else setTickRandomly(false);
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isAreaLoaded(pos, 1)) return;

        //Random Number On what face to do
        int whatFace = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        BlockPos face;

        int attempt = 0;
        while (true) {
            if (!state.isNormalCube()) return; //Avoids Loop if block already destroyed

            switch (whatFace) {
                case 0: default: face = pos.up(); break;
                case 1: face = pos.down(); break;
                case 2: face = pos.north(); break;
                case 3: face = pos.south(); break;
                case 4: face = pos.east(); break;
                case 5: face = pos.west();
            }

            //Correct Block
            if (worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.DIRT.getDefaultState().getBlock()
                    || worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.GRASS.getDefaultState().getBlock()
                    || worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.GRASS_PATH.getDefaultState().getBlock()
                    || worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.COBBLESTONE.getDefaultState().getBlock()
                    || worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.MOSSY_COBBLESTONE.getDefaultState().getBlock()
                    || worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.LOG.getDefaultState().getBlock()
                    || worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.LEAVES.getDefaultState().getBlock()
                    || worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.LEAVES2.getDefaultState().getBlock()
                    || worldIn.getBlockState(new BlockPos(face)).getBlock() == Blocks.PLANKS.getDefaultState().getBlock()) break;


            //Incorrect Block
            whatFace = ThreadLocalRandom.current().nextInt(0, 5 + 1);
            attempt++;
            if (attempt == 10) return;
        }

        double spawnChance = Math.random() * 100;
        IBlockState Block = XKUnity.SCP610A.getDefaultState();
        if (spawnChance < 30) Block = XKUnity.SCP610B.getDefaultState();

        worldIn.setBlockState(face, Block);
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) { return new AxisAlignedBB(0, 0, 0, 0.0625 * 16, 0.0625 * 14.5, 0.0625 * 16); }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        entityIn.motionX *= 0.4D;
        entityIn.motionZ *= 0.4D;
    }
}