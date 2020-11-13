package com.topraktunca.element.util;

import com.topraktunca.element.armor.ModArmorMaterial;
import com.topraktunca.element.blocks.*;
import com.topraktunca.element.element_t;
import com.topraktunca.element.items.ItemBase;
import com.topraktunca.element.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, element_t.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, element_t.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Items
    public static final RegistryObject<Item>  ELEMENT_T = ITEMS.register("element_t", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> T_SWORD = ITEMS.register("t_sword", () ->
            new SwordItem(ModItemTier.ELEMENT_T, 25, -2.1F, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<PickaxeItem> T_PICKAXE = ITEMS.register("t_pickaxe", () ->
            new PickaxeItem(ModItemTier.ELEMENT_T, 10, -2.1F, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<AxeItem> T_AXE = ITEMS.register("t_axe", () ->
            new AxeItem(ModItemTier.ELEMENT_T, 35, -2.8F, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<ShovelItem> T_SHOVEL = ITEMS.register("t_shovel", () ->
            new ShovelItem(ModItemTier.ELEMENT_T, 5, -2.1F, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<HoeItem> T_HOE = ITEMS.register("t_hoe", () ->
            new HoeItem(ModItemTier.ELEMENT_T, -1.0F, new Item.Properties().group(element_t.TAB)));

    //Armors
    public static final RegistryObject<ArmorItem> T_HELMET = ITEMS.register("t_helmet", () ->
            new ArmorItem(ModArmorMaterial.ELEMENT, EquipmentSlotType.HEAD, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<ArmorItem> T_CHESTPLATE = ITEMS.register("t_chestplate", () ->
            new ArmorItem(ModArmorMaterial.ELEMENT, EquipmentSlotType.CHEST, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<ArmorItem> T_LEGGINGS = ITEMS.register("t_leggings", () ->
            new ArmorItem(ModArmorMaterial.ELEMENT, EquipmentSlotType.LEGS, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<ArmorItem> T_BOOTS = ITEMS.register("t_boots", () ->
            new ArmorItem(ModArmorMaterial.ELEMENT, EquipmentSlotType.FEET, new Item.Properties().group(element_t.TAB)));


    //Blocks
    public static final RegistryObject<Block>  T_ORE = BLOCKS.register("t_ore", TOre::new);
    public static final RegistryObject<Block>  T_ORE_BLOCK = BLOCKS.register("t_ore_block", TOreBlock::new);
    public static final RegistryObject<Block>  T_GRASS_BLOCK = BLOCKS.register("t_grass_block", TGrassBlock::new);
    public static final RegistryObject<Block>  T_PLANKS = BLOCKS.register("t_planks", ()-> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block>  T_LOG = BLOCKS.register("t_log", ()-> new HorizontalPillarBlock(Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block>  T_LEAVES = BLOCKS.register("t_leaves", ()-> new Block(Block.Properties.from(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> T_SAPLING = BLOCKS.register("t_sapling", () -> new TSaplingBlock(null, Block.Properties.from(Blocks.OAK_LOG)));
    //Block Items
    public static final RegistryObject<Item>  T_ORE_ITEM = ITEMS.register("t_ore", () -> new BlockItemBase(T_ORE.get()));
    public static final RegistryObject<Item>  T_ORE_BLOCK_ITEM = ITEMS.register("t_ore_block", () -> new BlockItemBase(T_ORE_BLOCK.get()));
    public static final RegistryObject<Item>  T_GRASS_ITEM = ITEMS.register("t_grass_block", () -> new BlockItemBase(T_GRASS_BLOCK.get()));
    public static final RegistryObject<Item>  T_PLANKS_ITEM = ITEMS.register("t_planks", () -> new BlockItemBase(T_PLANKS.get()));
    public static final RegistryObject<Item>  T_LOG_ITEM = ITEMS.register("t_log", () -> new BlockItemBase(T_LOG.get()));
    public static final RegistryObject<Item>  T_SAPLING_ITEM = ITEMS.register("t_sapling", () -> new BlockItemBase(T_SAPLING.get()));
    public static final RegistryObject<Item>  T_LEAVES_ITEM = ITEMS.register("t_leaves", () -> new BlockItemBase(T_LEAVES.get()));


}
