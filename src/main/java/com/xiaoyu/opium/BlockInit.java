package com.xiaoyu.opium;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class BlockInit {

    private BlockInit() {}

    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, Opium.MODID);

    public static final RegistryObject<Block> CANNABIS_BLOCK = BLOCK.register("cannabis_block",()->new Block(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK)));

}
