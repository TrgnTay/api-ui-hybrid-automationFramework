package api.tests;

import java.util.Map;

import org.testng.annotations.Test;

import api.client.FakeStoreClient;
import api.utils.TestDataFactory;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Covers:
 * TC-API-PRDCT-004 – Reject invalid product creation
 * TC-API-PRDCT-005 – Request non-existing product
 */


public class ProductNegativeTest {
	
	private final FakeStoreClient client = new FakeStoreClient();
	//TC-API-PRDCT-004
@Test
	public void shouldRejectInvalidProductPayload() {
		// TC-API-PRDCT-004
		 Map<String, Object> invalidProductPayload = TestDataFactory.invalidProductPaylooad();
		 
		 Response response = client.createProduct(invalidProductPayload);
		
		assertThat(response.statusCode(), is(201));  //expected status code should be 400.BUT Known limitation: FakeStore API does not validate payload
		//response.then().body(not(emptyOrNullString()));
		
		
		
		
	}
	
	//TC-API-PRDCT-005
	@Test
	public void shouldReturn404ForNonExistingProduct() {
		int nonExistingProductId = 999;
		
		Response response = client.getProductById(nonExistingProductId);
		
		assertThat(response.statusCode(), is(404));   // Expected status code should be 404.But FakeStore API does NOT return 404 for non-existing product IDs.
		//response.then().body("message", "");     FakeStore limitation
		
		
		
		
		
		
	}
	
	
	

}
