package com.min01.getintheraid.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.min01.getintheraid.EventHandlerForge;

import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

@Mixin(EntityType.class)
public class MixinEntityType
{
	@Inject(at = @At("HEAD"), method = "is", cancellable = true)
	private void is(TagKey<EntityType<?>> p_204040_, CallbackInfoReturnable<Boolean> cir)
	{
		if(p_204040_ == EntityTypeTags.RAIDERS)
		{
			if(EventHandlerForge.RAIDER_LIST.contains(EntityType.class.cast(this)))
			{
				cir.setReturnValue(true);
			}
		}
	}
}
