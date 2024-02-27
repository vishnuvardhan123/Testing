package dmr_testing;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;
import org.aeonbits.owner.ConfigFactory;
	
	
	@Config.Sources({
		
					"system:properties",
					"system:env",
					"file:${user.dir}/Resorce/Dev.properties"})
	

	public interface WebConfig extends Config {
		
		String url();
	}

