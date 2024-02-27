package Testing.RestAssured;

import java.util.HashMap;

import org.apache.http.entity.ContentType;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Authorization {
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	@Parameters("url")
	public void Authorization(String url) throws JsonProcessingException {
			
		String endpont=url;
		
		RequestSpecification httprequest = RestAssured.given();
		
		
		JSONObject payload = new JSONObject();
		JSONObject inputMetaData = new JSONObject();
		
		inputMetaData.put("consumerAppId", "PPRLESSEPMP");
		inputMetaData.put("consumerType", "CA");
		inputMetaData.put("consumerAppType", "IA");
		inputMetaData.put("externalCorrelationId", "HemiIRxPTest123");
		payload.put("inputMetaData", inputMetaData);
		payload.put("command", "GetContext");
		payload.put("idType", "P");
		payload.put("id", "85876311");
		
		System.out.println(payload.toString());
		
		String authtoken="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IlQxU3QtZExUdnlXUmd4Ql82NzZ1OGtyWFMtSSIsImtpZCI6IlQxU3QtZExUdnlXUmd4Ql82NzZ1OGtyWFMtSSJ9.eyJhdWQiOiJhYTU0MDc4Yy0wZDY4LTRmMTUtOTM3Yy1jOWU3OGI4NzFlZGYiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC84ZDEzMzBmYy00MGQxLTQ2NmItYWMzYi1jYzlkMThlYzlmZTcvIiwiaWF0IjoxNzAyMDIyMjE4LCJuYmYiOjE3MDIwMjIyMTgsImV4cCI6MTcwMjAyNjExOCwiYWlvIjoiRTJWZ1lKaWVucnU2TEs1OFZrL0wxTmg0YWM1NEFBPT0iLCJhcHBpZCI6IjY2NTkxNjljLWY4MjEtNDBhMS1iYjc4LWU1NDg0ZTY3ZjhmMSIsImFwcGlkYWNyIjoiMSIsImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzhkMTMzMGZjLTQwZDEtNDY2Yi1hYzNiLWNjOWQxOGVjOWZlNy8iLCJvaWQiOiJmZTcxMzRhYS03ZmNiLTQ1NTYtOTU5YS0wYzQ0NzgzZjNkYmMiLCJyaCI6IjAuQVIwQV9EQVRqZEZBYTBhc084eWRHT3lmNTR3SFZLcG9EUlZQazN6SjU0dUhIdDhkQUFBLiIsInJvbGVzIjpbImNvbnRleHRsb291cC1tcyJdLCJzdWIiOiJmZTcxMzRhYS03ZmNiLTQ1NTYtOTU5YS0wYzQ0NzgzZjNkYmMiLCJ0aWQiOiI4ZDEzMzBmYy00MGQxLTQ2NmItYWMzYi1jYzlkMThlYzlmZTciLCJ1dGkiOiJtY29qcVhTRGYweVFBWVNaaGlSd0FBIiwidmVyIjoiMS4wIn0.dTsjbTtl1Ok7-nP_vCjUz4z_HMqDnQJTOJmEDMqX2xfcojMg6FAYxVShFHb64frB4MDTr40H5iBsAcc9PRYI-rv0PU6JCtOuMCnJQwugBs3EbZf7qpJVeegsGYCO6gTZ9p1-CKgAjqw1wbiAhWt8GhtKeihtc9gxUrSRCBfvR21Ah7cw8hWYuACwYR5tZy4WuuLysFd_txcEquTJHEO8aa_v0Ns7rBVqsRxdGFWImFjVnY6h5-WNScxEdELLTEJlUjLQimo0bnhcxILIxABchaHlUNa1jqtaOMVIEadCW9bsrQtuyPRlyyZc5YE3-um9pmLJ4vlaRxlGeH8jpdPhJg";
//		payload.put("Content-Type", "application/json");
		
		
		
		httprequest.header("Authorization",authtoken);
		httprequest.header("Content-Type","application/json");
		httprequest.body(payload.toJSONString());
		
		//Response response = httprequest.request(Method.POST);
		
		Response response = httprequest.post(url);
		
		ObjectMapper obj = new ObjectMapper();
		
		String resp = obj.writerWithDefaultPrettyPrinter().writeValueAsString(response);
		
		System.out.println(resp);
		
		//String Jsonresponse = obj.writerWithDefaultPrettyPrinter().writeValueAsString(response);
		
		
		//System.out.println("Json Response is " + Jsonresponse);
		
		System.out.println(response.getBody().asString());
		
	
		
		}
	
	
}
