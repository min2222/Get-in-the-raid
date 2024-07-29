package com.min01.getintheraid;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.raid.Raider;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Getintheraid.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandlerForge
{
	public static final List<EntityType<?>> RAIDER_LIST = new ArrayList<>();
	
	@SubscribeEvent
	public static void onEntityJoinLevel(EntityJoinLevelEvent event)
	{
		if(Raider.class.isInstance(event.getEntity()))
		{
			RAIDER_LIST.add(event.getEntity().getType());
		}
	}
}
