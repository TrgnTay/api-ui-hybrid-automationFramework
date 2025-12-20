package api.tests;

import org.testng.annotations.Test;

import api.client.FakeStoreClient;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Th efollowing test cases are covered:
 * TC-API-PRDCT-001 – Get all products
 * 
 * 
 * */

public class ProductPositiveTest {
	
	FakeStoreClient client = new FakeStoreClient();
	
	
	@Test
	public void shouldRetrieveAllProducts() {
		
		
		Response response =  client.getAllPrducts();
		assertThat(response.statusCode(), is(200));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
