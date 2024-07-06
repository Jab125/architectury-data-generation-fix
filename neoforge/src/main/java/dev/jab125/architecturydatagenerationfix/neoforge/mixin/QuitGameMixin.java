package dev.jab125.architecturydatagenerationfix.neoforge.mixin;

import net.minecraft.data.DataGenerator;
import net.neoforged.neoforge.data.loading.DatagenModLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DatagenModLoader.class)
public class QuitGameMixin {
	@Inject(method = "begin", at = @At("RETURN"))
	private static void architecturyDataGenerationFix$run(CallbackInfo ci) {
		System.exit(0);
	}
}
