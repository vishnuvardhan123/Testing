package dmr_testing;

import java.io.File;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DMR_UploadAPI {


	public static void main(String[] args) {
		
		
		
		String url ="https://login.microsoftonline.com/orxhemib2c.onmicrosoft.com/oauth2/token";
		
		RequestSpecification httprequest = RestAssured.given().
				multiPart("client_id", "c3d7fc0e-3d50-47a2-a0b4-84cf40bd4635").
				multiPart("client_secret", "xIX8Q~-ppwRp~SFdwRpBg9iGsyutzaHXNskuVcEZ").
				multiPart("resource", "c3d7fc0e-3d50-47a2-a0b4-84cf40bd4635").
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
		
		api_request.header("Authorization",authtoken);
		//api_request.header("Content-Type","application/image/png");
		api_request.multiPart("filesData",new File("./UATBK1+-+Walmart+-+CLUBS,+KING+-+11212023-3.png"),"application/image/png").
		multiPart("inputMetaData", " {\r\n"
				+ "    \"consumerAppId\": \"DMR MemberPortal\",\r\n"
				+ "    \"externalCorrelationId\": \"87987987998\",\r\n"
				+ "    \"consumerType\": \"MA\",\r\n"
				+ "    \"consumerAppType\": \"EX\"\r\n"
				+ "  }").
		multiPart("fileType", "Walmart");
		
		
		//api_request.body(payload.toJSONString());
		
		Response api_response = api_request.post("https://cpa-apimtst-cloud.optum.com/dmr/v1/filesUpload");
		
		System.out.println(api_response.getBody().asString());
		
		System.out.println(api_response.statusCode());
	
	
	}

}
