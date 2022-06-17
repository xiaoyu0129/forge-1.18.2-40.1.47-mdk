package com.xiaoyu.opium.common.items;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class CookedCannabisItem extends Item {
    public CookedCannabisItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                .food(new FoodProperties.Builder().alwaysEat()
                        .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,15*20,5),1)
                        .effect(()->new MobEffectInstance(MobEffects.SATURATION,15*20,100),1)
                        .effect(()->new MobEffectInstance(MobEffects.HUNGER,50*20,2),1)
                        .nutrition(1000).build()));
    }
}
