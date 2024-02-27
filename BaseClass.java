package dmr_testing;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	protected String authtoken ="";
	
	protected String trackingid="";
	
	
	
	//@Parameters({"env"})
	@BeforeTest
	
	public void Tokengeneration() throws JsonProcessingException {
		
		FrameworkConfig runner = ConfigFactory.create(FrameworkConfig.class);
		
		String url = runner.url();
		
		System.out.println("The input Url for token is " + url);
		
		RequestSpecification httprequest = RestAssured.given().
				multiPart("client_id", "c3d7fc0e-3d50-47a2-a0b4-84cf40bd4635").
				multiPart("client_secret", "xIX8Q~-ppwRp~SFdwRpBg9iGsyutzaHXNskuVcEZ").
				multiPart("resource", "c3d7fc0e-3d50-47a2-a0b4-84cf40bd4635").
				multiPart("grant_type", "client_credentials");
				
				httprequest.header("Content-Type","multipart/form-data");
				//httprequest.body(inputMetaData.toJSONString());
				
				Response response = httprequest.post(url);
				
				System.out.println(response.getStatusCode());
				
				String responsebody = response.getBody().asString();
				System.out.println(responsebody);
				
				JsonPath path = new JsonPath(responsebody);
				String access_token = path.getJsonObject("access_token");
				
				authtoken="Bearer "+access_token;
				
				System.out.println(authtoken);
				
				System.out.println(access_token);
				
	}
	
	

}
