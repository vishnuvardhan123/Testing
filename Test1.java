package Testing.RestAssured;

import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Test1{
	
	
	
	@Test(alwaysRun=true)
	public void Rhetest() throws InterruptedException {
		
		
		Response response = RestAssured.
		given().
			header("Content-type","application/json").
			header("authorization","").
		when().
			post().
		then().
			statusCode(200).statusLine("").
			assertThat().
			body("responsebody", Matchers.equalTo("")).extract().path("statuscode");
		
			
		
		int statuscode = response.path("statuscode");
											
		Thread.sleep(30);
		
		System.out.println("Hello WOrld");
		

//		String message = "No Zipcode open";
//		//RestAssured.baseURI="https://dde-nonprod-cloud.optum.com";
//		
//		JSONObject payload = new JSONObject();
//		
//		payload.put("toProcess", "N");
//		
//		
//		RestAssured.
//		
//		given().
//		
//			headers("Content-Type","application/json").
//			
//			body(payload.toJSONString()).
//		
//		when().
//		
//			post("https://dde-nonprod-cloud.optum.com/dde-test/rhe-release-hold-batch/rhe/releaseHold").
//		
//		then().
//		
//			log().all().
//			
//			assertThat().
//			
//			statusCode(200).
//			
//			body("outputMetaData.responseCode", Matchers.equalTo("200"));
//		
		
	}
	

	@Test(dependsOnMethods="Rhetest")
	public void test2() {
		
		
		System.out.println("Hello WOrld");
		
		
	}

}
