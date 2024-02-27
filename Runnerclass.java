package dmr_testing;

import org.aeonbits.owner.ConfigFactory;

public class Runnerclass {

	public static void main(String[] args) {
	
		FrameworkConfig runner = ConfigFactory.create(FrameworkConfig.class);
		
		System.out.println(runner.url());

	}

}
