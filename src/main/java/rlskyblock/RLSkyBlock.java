package rlskyblock;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = RLSkyBlock.MODID, version = RLSkyBlock.VERSION, name = RLSkyBlock.NAME, dependencies = "required-after:fermiumbooter")
public class RLSkyBlock {
    public static final String MODID = "rlskyblock";
    public static final String VERSION = "1.0.1";
    public static final String NAME = "RLSkyBlock";
    public static final Logger LOGGER = LogManager.getLogger();
}