package Testing.RestAssured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EPMP_PatientID {


	public static void main(String[] args) {
		
		
		
		String url ="https://login.microsoftonline.com/orxhemib2c.onmicrosoft.com/oauth2/token";
		
		RequestSpecification httprequest = RestAssured.given().
				multiPart("client_id", "6659169c-f821-40a1-bb78-e5484e67f8f1").
				multiPart("client_secret", "c_G8Q~Ys2RmEQP2YGLKiIGuNctUiTu9okOgGkazc").
				multiPart("resource", "aa54078c-0d68-4f15-937c-c9e78b871edf").
				multiPart("grant_type", "client_credentials");

		httprequest.header("Content-Type","multipart/form-data");
		//httprequest.body(inputMetaData.toJSONString());
		
		Response response = httprequest.post(url);
		
		String responsebody = response.getBody().asString();
		
		JsonPath path = new JsonPath(responsebody);
		String access_token = path.getJsonObject("access_token");
		
		String authtoken="Bearer "+access_token;
		
		System.out.println(authtoken);
		
		System.out.println(access_token);
		

		
		RequestSpecification api_request= RestAssured.given();
		
//		JSONObject payload = new JSONObject();
//		JSONObject inputMetaData = new JSONObject();
		
//		inputMetaData.put("consumerAppId", "PPRLESSEPMP");
//		inputMetaData.put("consumerType", "CA");
//		inputMetaData.put("consumerAppType", "IA");
//		inputMetaData.put("externalCorrelationId", "HemiIRxPTest123");
//		payload.put("inputMetaData", inputMetaData);
//		payload.put("command", "GetContext");
//		payload.put("idType", "P");
//		payload.put("id", "85876311");
		
		String payload = "{\r\n"
				+ "    \"inputMetaData\": {\r\n"
				+ "        \"consumerAppId\": \"PPRLESSEPMP\",\r\n"
				+ "        \"consumerType\": \"CA\",\r\n"
				+ "        \"consumerAppType\": \"IA\",\r\n"
				+ "        \"externalCorrelationId\": \"HemiIRxPTest202309072\"\r\n"
				+ "    },\r\n"
				+ "    \"command\": \"GetContext\",\r\n"
				+ "    \"idType\": \"P\",\r\n"
				+ "    \"id\": \"85876311\",\r\n"
				+ "    \"carrierId\": \"UHPMEDD\",\r\n"
				+ "    \"groupId\": \"O11817OEB15501\",\r\n"
				+ "    \"accountId\": \"GH2001038E23\",\r\n"
				+ "    \"instanceId\": \"\"\r\n"
				+ "}";
		
		System.out.println(payload.toString());
		

		api_request.header("Authorization",authtoken);
		api_request.header("Content-Type","application/json");
		api_request.body(payload);
		
		Response api_response = api_request.post("https://epmp-apimdev-cloud.optum.com/ContextLookup/v1");
		
		String API_response_body =api_response.getBody().asString();
		
		System.out.println(API_response_body);
		
		JsonPath response_path = new JsonPath(API_response_body);
		
		String Status_code=response_path.getJsonObject("outputMetaData.responseCode");
		String Status_msg=response_path.getJsonObject("outputMetaData.responseMessage");
		
		System.out.println(Status_code);
		System.out.println(Status_msg);
	
	
	
	}

}
