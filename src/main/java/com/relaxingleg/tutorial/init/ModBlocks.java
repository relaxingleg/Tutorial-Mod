package com.relaxingleg.tutorial.init;

import com.relaxingleg.tutorial.TutorialMod;
import com.relaxingleg.tutorial.blocks.RotateBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> ROTATE_BLOCK = BLOCKS.register("rotate_block", () -> new RotateBlock(BlockBehaviour.Properties.copy(Blocks.DISPENSER)));

    public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK_ITEM = BLOCK_ITEMS.register("sapphire_block", () -> new BlockItem(SAPPHIRE_BLOCK.get(), new Item.Properties().tab(TutorialMod.MOD_STUFF)));
    public static final RegistryObject<BlockItem> SAPPHIRE_ORE_ITEM = BLOCK_ITEMS.register("sapphire_ore", () -> new BlockItem(SAPPHIRE_ORE.get(), new Item.Properties().tab(TutorialMod.MOD_STUFF)));
    public static final RegistryObject<BlockItem> ROTATE_BLOCK_ITEM = BLOCK_ITEMS.register("rotate_block", () -> new BlockItem(ROTATE_BLOCK.get(), new Item.Properties().tab(TutorialMod.MOD_STUFF)));
}
