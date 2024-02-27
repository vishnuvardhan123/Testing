package emailTesting;

import org.testng.annotations.Test;

import com.azure.core.http.rest.Response;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;



public class TestNG {
	
	
	@Test
	public void test1() {
		
		RequestSpecification request = RestAssured.given().
				multiPart("client_id","6659169c-f821-40a1-bb78-e5484e67f8f1").
				multiPart("client_secret","c_G8Q~Ys2RmEQP2YGLKiIGuNctUiTu9okOgGkazc").
				multiPart("resource","aa54078c-0d68-4f15-937c-c9e78b871edf").
				multiPart("grant_type","client_credentials");
		
		request.headers("Content-Type", "multipart/form-data");
		
		
		
		io.restassured.response.Response response = request.post("https://login.microsoftonline.com/orxhemib2c.onmicrosoft.com/oauth2/token");
		
		String responsebody = response.getBody().asString();
		
		JsonPath path = new JsonPath(responsebody);
		String access_token = path.getJsonObject("access_token");
				
		
		System.out.println(access_token);
		

}
}