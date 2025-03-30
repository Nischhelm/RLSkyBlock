package rlskyblock;

import net.minecraftforge.common.config.Config;

@Config(modid = RLSkyBlock.MODID)
public class ConfigHandler {
    @Config.Comment("Use this to append more preset values to the default \"3;1*minecraft:air\" of VoidIslandControl VOID world, for example to allow strongholds to generate.")
    @Config.Name("Flat Preset Values")
    public static String flatPreset = "3;minecraft:air;;stronghold(count=128)";

    @Config.Comment("Use this to disable the /island command group.")
    @Config.Name("Disable Island Command")
    public static boolean islandCommandDisabled = true;

    @Config.Comment("Use this to disable the /startingInv command.")
    @Config.Name("Disable StartingInv Command")
    public static boolean startingInvCommandDisabled = true;
}
