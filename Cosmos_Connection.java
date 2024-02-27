package Testing.RestAssured;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosAsyncDatabase;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosContainer;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.util.CosmosPagedFlux;



public class Cosmos_Connection {
	
     private static String endpointUri = "https://dde-tst-us-c-cosmosdb.documents.azure.com:443/";
     private static String primaryKey = "WwJYV0RKEqZQvglrOweWUnyHdFnkw13GcLTzaH1F2wSNyGqN7bN8jmRAxR0rBnrig05bFjy7EQUJACDbXtDb9A==";
     public static void main(String[] args) {
		  
    	 CosmosAsyncClient client = new CosmosClientBuilder()
                 .endpoint(endpointUri)
                 .key(primaryKey)
                 .consistencyLevel(ConsistencyLevel.EVENTUAL)
                 .contentResponseOnWriteEnabled(true)
                 .buildAsyncClient();
    	 
    	 CosmosAsyncDatabase db =  client.getDatabase("dde-estimates-cdb");
         //initialization of the CosmosDatabase object
         CosmosAsyncContainer container = db.getContainer("delivery_dates");
              
         String query = "SELECT c.shippingMethod FROM c WHERE c.fillType='REFILL'";
         
         //container.queryItems(query, null, null);
        
      // Set some common query options
         CosmosQueryRequestOptions queryOptions = new CosmosQueryRequestOptions();
         //queryOptions.setEnableCrossPartitionQuery(true); //No longer necessary in SDK v4
         //  Set query metrics enabled to get metrics around query executions
         queryOptions.setQueryMetricsEnabled(true);

         //CosmosPagedIterable<Shipping> queryresult = container.queryItems( query, queryOptions, Shipping.class);
         
         //container.queryItems(query, queryOptions,Shipping.class);
         
         //container.queryItems(query, queryOptions, Shipping.class);
         
         //container.queryItems(query, queryOptions, Shipping.class).byPage();
       
            
         //System.out.println(container.queryItems(query, queryOptions, Shipping.class).byPage());
         
         
        
         client.close(); 
           
           
	}
	
	
	
}
