package com.topraktunca.element.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.ToolType;

public class TGrassBlock extends Block {

    public TGrassBlock() {
        super(Properties.create(Material.ORGANIC)
                .hardnessAndResistance(2.0f, 20.0f)
                .sound(SoundType.GROUND)
                .harvestLevel(1)
                .harvestTool(ToolType.SHOVEL));
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        Block plant = plantable.getPlant(world, pos.offset(facing)).getBlock();

        if (plant == Blocks.OAK_SAPLING){
            return true;
        } else {
            return super.canSustainPlant(state, world, pos, facing, plantable);
        }
    }
}
