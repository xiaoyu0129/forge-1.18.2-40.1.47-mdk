package com.xiaoyu.opium;

import com.xiaoyu.opium.common.items.CookedCannabisItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    private ItemInit(){}
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Opium.MODID);
    public static final RegistryObject<Item> OPIUM_ITEM = ITEMS.register("opium_item",()->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat()
                            .effect(()->new MobEffectInstance(MobEffects.CONFUSION,30*20,1),1)
                            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20*20,5),1)
                            .effect(()->new MobEffectInstance(MobEffects.POISON,15*20,4),1)
                            .effect(()->new MobEffectInstance(MobEffects.WEAKNESS,40*20,2),1)
                            .nutrition(2)
                            .build())));
    public static final  RegistryObject<Item> OPIUM_SEED_ITEM = ITEMS.register("opium_seed_item",()->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COCA_LEAF_ITEM = ITEMS.register("coca_leaf_item",()->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COCAINE_ITEM = ITEMS.register("cocaine_item",()->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat()
                            .effect(()->new MobEffectInstance(MobEffects.CONFUSION,30*20,1),1)
                            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20*20,5),1)
                            .effect(()->new MobEffectInstance(MobEffects.POISON,15*20,4),1)
                            .effect(()->new MobEffectInstance(MobEffects.WEAKNESS,40*20,2),1)
                            .nutrition(2)
                            .build())));
    public static final RegistryObject<Item> CANNABIS_ITEM = ITEMS.register("cannabis_item",()->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COOKED_CANNABIS_ITEM =ITEMS.register("cooked_cannabis_item",()->new CookedCannabisItem());

    //Block Item

    public static final RegistryObject<BlockItem> CANNABIS_BLOCK=ITEMS.register("cannabis_block"
            ,()->new BlockItem(BlockInit.CANNABIS_BLOCK.get(),new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
}
