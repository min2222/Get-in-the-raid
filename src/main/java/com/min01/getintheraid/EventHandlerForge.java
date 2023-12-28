package com.min01.getintheraid;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.AbstractIllager;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandlerForge
{
	public static final List<EntityType<?>> RAIDER_LIST = new ArrayList<>();
	
	@SubscribeEvent
	public static void entityJoin(EntityJoinLevelEvent event)
	{
		if(AbstractIllager.class.isInstance(event.getEntity()))
		{
			RAIDER_LIST.add(event.getEntity().getType());
		}
	}
}
