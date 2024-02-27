package ddd_api;

import org.testng.annotations.Test;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosContainer;
import com.azure.cosmos.CosmosDatabase;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.util.CosmosPagedIterable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadCosmos {
	
	 private static String endpointUri = "https://dde-tst-us-c-cosmosdb.documents.azure.com:443/";
     private static String primaryKey = "WwJYV0RKEqZQvglrOweWUnyHdFnkw13GcLTzaH1F2wSNyGqN7bN8jmRAxR0rBnrig05bFjy7EQUJACDbXtDb9A==";
	
     @Test
	
	public void readcosmosdata() throws JsonProcessingException {
		
	 
	 CosmosQueryRequestOptions queryOptions = new CosmosQueryRequestOptions();
		  
   	 CosmosClient client = new CosmosClientBuilder()
                .endpoint(endpointUri)
                .key(primaryKey)
                .consistencyLevel(ConsistencyLevel.EVENTUAL)
	             .contentResponseOnWriteEnabled(true)
	             .gatewayMode()
	             .buildClient();
   	 
   	 CosmosDatabase db =  client.getDatabase("dde-estimates-cdb");
        //initialization of the CosmosDatabase object
        CosmosContainer container = db.getContainer("delivery_dates");
             
        String query = "SELECT * FROM c WHERE c.fillType='REFILL'";
        
        CosmosPagedIterable<Shipping> filtered = container.queryItems(query, queryOptions, Shipping.class);
	        if (filtered.iterator().hasNext()) {
	        	Shipping Shipping_Method = filtered.iterator().next();
	        	//System.out.println(docProps);
	        	
	        	System.out.println("Shipping Method is " + Shipping_Method.getShippingMethod());
//	        	printDeliveryObject (Shipping_Method);
	        	client.close(); 
	        }
	        
	        ObjectMapper mapper = new ObjectMapper();
//	        System.out.println(mapper.readValue("shippingMethod", Shipping.class));
	        
	        String response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(filtered);
	        
	      
	        
	        System.out.println(response);
	        
	      
	        
    }
//	  public static void printDeliveryObject(Shipping Shipping_Method){
//		
//		System.out.println(String.format("%s","<->"));
//     	System.out.println(String.format("Query result: Id = (%s)",Shipping_Method.getId()));
//     	System.out.println(String.format("Query result: ConfidenceLevel = (%s)",Shipping_Method.getConfidenceLevel()));
//     	System.out.println(String.format("Query result: EstimatedDays = (%s)",Shipping_Method.getEstimatedDays()));
//     	System.out.println(String.format("Query result: FillType = (%s)",Shipping_Method.getFillType()));
//     	System.out.println(String.format("Query result: PrescriptionType = (%s)",Shipping_Method.getPrescriptionType()));
//     	System.out.println(String.format("Query result: ShippingMethod = (%s)",Shipping_Method.getShippingMethod()));
//     	System.out.println(String.format("Query result: ZipCode = (%s)",Shipping_Method.getZipcode()));
//     	System.out.println(String.format("Query result: CleanStatus = (%s)",Shipping_Method.getCleanStatus()));
//     	System.out.println(String.format("Query result: AzureUpdateDate = (%s)",Shipping_Method.getAzureUpdateDate()));
//		
//	}

}
