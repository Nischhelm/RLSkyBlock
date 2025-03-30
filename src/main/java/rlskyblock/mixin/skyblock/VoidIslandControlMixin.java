package rlskyblock.mixin.skyblock;

import com.bartz24.voidislandcontrol.VoidIslandControl;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.command.ICommand;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import rlskyblock.ConfigHandler;

@Mixin(VoidIslandControl.class)
public class VoidIslandControlMixin {
    @WrapWithCondition(
            method = "serverLoading",
            at = @At(value = "INVOKE", target = "Lnet/minecraftforge/fml/common/event/FMLServerStartingEvent;registerServerCommand(Lnet/minecraft/command/ICommand;)V", ordinal = 0),
            remap = false
    )
    private boolean rlskyblock_disableCommand_island(FMLServerStartingEvent instance, ICommand command){
        return !ConfigHandler.islandCommandDisabled;
    }

    @WrapWithCondition(
            method = "serverLoading",
            at = @At(value = "INVOKE", target = "Lnet/minecraftforge/fml/common/event/FMLServerStartingEvent;registerServerCommand(Lnet/minecraft/command/ICommand;)V", ordinal = 1),
            remap = false
    )
    private boolean rlskyblock_disableCommand_startingInv(FMLServerStartingEvent instance, ICommand command){
        return !ConfigHandler.startingInvCommandDisabled;
    }
}
