package its_meow.breadstone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import its_meow.breadstone.proxy.ISidedProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MOD_ID, name = Ref.NAME, version = Ref.VERSION, acceptedMinecraftVersions = Ref.acceptedMCV)
public class BreadStoneMod {

	@Instance(Ref.MOD_ID) 
	public static BreadStoneMod mod;
	
	@SidedProxy(clientSide = Ref.CLIENT_PROXY_C, serverSide = Ref.SERVER_PROXY_C)
	public static ISidedProxy proxy;

	public static CreativeTab tab = new CreativeTab("Bread Stone");

	public static Logger logger;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = LogManager.getLogger("breadstone");
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}