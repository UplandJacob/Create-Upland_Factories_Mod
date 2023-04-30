package com.uplandjacob.create_upland_factories.item.custom;

import com.uplandjacob.create_upland_factories.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class LightningHammerItem extends SwordItem {


    public LightningHammerItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player playerIn, InteractionHand handIn) {

        ItemStack itemstack = playerIn.getItemInHand(handIn);
        BlockPos location = Utils.getBlockAtCursor(playerIn, 200.0d, true);

        if(location != null){
            Utils.createExplosion(level, location, 15.0f);
            Utils.strikeLightning(level, location);
        }
        return InteractionResultHolder.pass(itemstack);
    }
}
