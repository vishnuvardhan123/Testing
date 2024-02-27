package Testing.RestAssured;

import static org.testng.Assert.assertEquals;

import org.apache.http.entity.ContentType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class RHE_BatchAPI {

	public static void main(String[] args) {
		
		String message = "No Zipcode open";
		//RestAssured.baseURI="https://dde-nonprod-cloud.optum.com";
		
		JSONObject payload = new JSONObject();
		
		payload.put("toProcess", "N");
		
		
		RestAssured.
		
		given().
		
			headers("Content-Type","application/json").
			
			body(payload.toJSONString()).
		
		when().
		
			post("https://dde-nonprod-cloud.optum.com/dde-test/rhe-release-hold-batch/rhe/releaseHold").
		
		then().
		
			log().all().
			
			assertThat().
			
			statusCode(200).
			body("outputMetaData.responseCode", Matchers.equalTo("200"))
				
			;
//		
////			body("outpumetadata.message",equalTo(message)).
		
			
		
		
		
		

	}

	

}
