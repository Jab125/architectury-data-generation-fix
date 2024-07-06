package dev.jab125.architecturydatagenerationfix.fabric.mixin;

import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SuppressWarnings("UnstableApiUsage")
@Mixin(value = FabricDataGenHelper.class, remap = false)
public class QuitGameMixin {
	@Inject(method = "run", at = @At("TAIL"))
	private static void architecturyDataGenerationFix$run(CallbackInfo ci) {
		System.exit(0);
	}
}
