package api.tests;

import org.testng.annotations.Test;

import api.client.FakeStoreClient;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Th efollowing test cases are covered:
 * TC-API-PRDCT-001 – Get all products
 * TC-API-PRDCT-002 – Get product by ID
 * 
 * */

public class ProductPositiveTest {
	
	FakeStoreClient client = new FakeStoreClient();
	
	//TC-API-PRDCT-001
	@Test
	public void shouldRetrieveAllProducts() {
		
		
		Response response =  client.getAllPrducts();
		assertThat(response.statusCode(), is(200));
		assertThat(response.jsonPath().getList("$"), is(not(empty())));
		
			
		}
		
		
	//TC-API-PRDCT-002
	@Test
	public void shouldRetriveProductByValidId() {
		
		int productValidId = 2;
		Response response = client.getProductById(productValidId);
		
		assertThat(response.statusCode(), is(200));
		assertThat(response.jsonPath().getInt("id"), equalTo(productValidId));
		assertThat(response.jsonPath().getString("title"), notNullValue());
		
		System.out.println(response);
		
	}
	
	
	

}
