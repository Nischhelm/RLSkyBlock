package rlskyblock;

import java.util.Map;
import fermiumbooter.FermiumRegistryAPI;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.12.2")
public class RLSkyBlockPlugin implements IFMLLoadingPlugin {

	public RLSkyBlockPlugin() {
		FermiumRegistryAPI.enqueueMixin(true, "mixins.rlskyblock.voidislandcontrol.json", () -> Loader.isModLoaded("voidislandcontrol"));
	}

	@Override
	public String[] getASMTransformerClass()
	{
		return new String[0];
	}
	
	@Override
	public String getModContainerClass()
	{
		return null;
	}
	
	@Override
	public String getSetupClass()
	{
		return null;
	}
	
	@Override
	public void injectData(Map<String, Object> data) { }
	
	@Override
	public String getAccessTransformerClass()
	{
		return null;
	}
}