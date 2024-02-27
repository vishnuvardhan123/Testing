package Testing.RestAssured;

import java.util.HashMap;
import java.util.LinkedList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HemiPatientSearch_PartyID {

	
	@Test
	
	public void Hemisearch() {
		
		String url="https://login.microsoftonline.com/orxhemib2c.onmicrosoft.com/oauth2/token";
		
		
		RequestSpecification request=RestAssured.given().
				multiPart("client_id", "6659169c-f821-40a1-bb78-e5484e67f8f1").
				multiPart("client_secret", "c_G8Q~Ys2RmEQP2YGLKiIGuNctUiTu9okOgGkazc").
				multiPart("resource", "50e66739-1513-4133-bdbe-19fbcd948531").
				multiPart("grant_type", "client_credentials");
		
		request.header("Content-Type","multipart/form-data");
		
		Response response=request.post(url);
		
		String response_body=response.getBody().asString();
		
		System.out.println(response_body);
		
		JsonPath auth_token=new JsonPath(response_body);
		String token_object = auth_token.getJsonObject("access_token");
		String token="Bearer " + token_object;
		System.out.println(token);
		
		String Hemi_url ="https://stghemi2-cloud.optum.com/v3.0/patient/partyid/search";
		
		RequestSpecification hemirequest= RestAssured.given();
		
//		HashMap<String,String>hm=new HashMap<String, String>();
//		
//		hm.put("partyId", "1723061");
//		hm.put("partyId", "1723061");
//		hm.put("partyId", "1723061");
		
		JSONObject payload = new JSONObject();
		
		payload.put("partyId", "1723061");
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("all");
		payload.put("include", list);
		payload.put("includeInactivePatient", "Y");
		
		JSONObject searchInputMetaData = new JSONObject();
		searchInputMetaData.put("consumerAppId", "PORTAL");
		searchInputMetaData.put("applicationId", "DDE");
		searchInputMetaData.put("externalCorrelationId", "HEMI-XPZi8abeCN0pL0lVaYO6C");
		
		payload.put("searchInputMetaData", searchInputMetaData);
		
		System.out.println(payload);
//		
		hemirequest.header("Content-Type","application/json");
		hemirequest.header("Authorization",token);
		
		hemirequest.body(payload);
		
		
//		
		Response hemi_response = hemirequest.post(Hemi_url);
//		
		String hemi_responsebody=hemi_response.getBody().asString();
		
		System.out.println(hemi_responsebody);
		
		JsonPath hemi_path = new JsonPath(hemi_responsebody);
		
		int address_size= hemi_path.getInt("patients[0].addresses.size()");
		
		for(int i =0; i<address_size;i++) {
			
			String address_node = "patients[0].addresses["+i+"].primary";
						
			String primary_address = hemi_path.getJsonObject(address_node);
			
			
			if(primary_address.equals("Y")) {
			
				System.out.println("State: " + hemi_path.getJsonObject("patients[0].addresses["+i+"].state"));
				System.out.println("Postal_Code: " +hemi_path.getJsonObject("patients[0].addresses["+i+"].postalCode"));
		}
		}
		
		System.out.println("Address Array Size is: " + address_size);
		String Status_Code= hemi_path.getJsonObject("searchOutputMetaData.respCode");
		
		System.out.println(Status_Code);
		
		
		

	}

}
