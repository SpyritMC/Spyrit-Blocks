package com.gmail.SpyritMC;

import com.gmail.SpyritMC.Blocks.BlackQuartz;
import com.gmail.SpyritMC.Blocks.BloodStone;
import net.fabricmc.api.ModInitializer;

public class SpyritBlocks implements ModInitializer {
	@Override
	public void onInitialize() {
		new BloodStone();
		new BlackQuartz();
	}
}
