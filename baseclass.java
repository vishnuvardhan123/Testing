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

public class baseclass {

	public static void main(String[] args) {
		
//		String url ="https://Optum.com";
//		
//		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//		
//		options.addArguments("--remote-allow-origins=*");
//		
//		WebDriver driver = new ChromeDriver(options);
//		
//		driver.get(url);
//		
		RestAssured.baseURI="https://dde-nonprod-cloud.optum.com/dde-test/rhe-release-hold-batch/rhe/releaseHold";
		
		RequestSpecification httprequest=RestAssured.given();
		
		//JSONObject requestvalidator=new JSONObject();	
		JSONObject inputmetadata=new JSONObject();
		
		inputmetadata.put("toProcess", "N");
		
		
		httprequest.header("Content-Type","application/json");
		httprequest.body(inputmetadata.toJSONString());
		
		Response response = httprequest.request(Method.POST);
		
		String statusbody = response.getBody().asString();
		
		System.out.println(statusbody);
		
		System.out.println(response.getStatusCode());
		
		
		

	}

}
