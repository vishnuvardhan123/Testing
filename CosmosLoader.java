package Testing.RestAssured;

import org.apache.http.entity.ContentType;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class CosmosLoader {


	public static void main(String[] args) {
		
		RestAssured.baseURI="https://dde-nonprod-cloud.optum.com/dde-test/dde-cosmos-loader/v2.0/deliverydates/cosmos/loader";
		
		RequestSpecification httprequest = RestAssured.given();
		
		JSONObject payload = new JSONObject();
		
//		payload.put("Content-Type", "application/json");
		
		payload.put("blobPath", "10102019/10102023_default_prediction_outcome_reporting.psv");
		
		httprequest.header("Content-Type","application/json");
		httprequest.body(payload.toJSONString());
		
		Response response = httprequest.request(Method.POST);
		
		System.out.println(response.getBody().asString());
		
		long time = response.getTime();
		
		System.out.println(time);
		System.out.println(response.getHeader("Content-Type"));
		
		int statuscode= response.statusCode();
		
		if(statuscode==200) {
			
			System.out.println("Status code is validated");
		}
		
		

	}

}
