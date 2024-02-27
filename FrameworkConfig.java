package dmr_testing;

import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	
			"system:properties",
			"system:env",
			"file:${user.dir}/Resource/Dev.properties"})

public interface FrameworkConfig extends Config {
	
	
	String Environment();
	
	
	@Key("${Environment}.url")
	String url();

}
