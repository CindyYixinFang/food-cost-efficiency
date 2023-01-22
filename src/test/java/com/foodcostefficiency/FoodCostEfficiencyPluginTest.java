package com.foodcostefficiency;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FoodCostEfficiencyPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FoodCostEfficiencyPlugin.class);
		RuneLite.main(args);
	}
}