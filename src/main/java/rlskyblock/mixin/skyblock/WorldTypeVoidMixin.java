package rlskyblock.mixin.skyblock;

import com.bartz24.voidislandcontrol.config.ConfigOptions;
import com.bartz24.voidislandcontrol.world.WorldTypeVoid;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.World;
import net.minecraft.world.gen.ChunkGeneratorFlat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import rlskyblock.ConfigHandler;

@Mixin(WorldTypeVoid.class)
public abstract class WorldTypeVoidMixin {
    @WrapOperation(
            method = "getChunkGenerator",
            at = @At(value = "NEW", target = "(Lnet/minecraft/world/World;JZLjava/lang/String;)Lnet/minecraft/world/gen/ChunkGeneratorFlat;")
    )
    private ChunkGeneratorFlat rlskyblock_enableStronghold(World worldIn, long seed, boolean generateStructures, String flatGeneratorSettings, Operation<ChunkGeneratorFlat> original){
        if(ConfigOptions.worldGenSettings.worldGenType == ConfigOptions.WorldGenSettings.WorldGenType.SUPERFLAT)
            return original.call(worldIn, seed, generateStructures, flatGeneratorSettings);
        return original.call(worldIn, seed, true, ConfigHandler.flatPreset);
    }
}
