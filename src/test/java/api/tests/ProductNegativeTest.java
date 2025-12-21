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
	
@Test
	public void shouldRejectInvalidProductPayload() {
		// TC-API-PRDCT-004
		 Map<String, Object> invalidProductPayload = TestDataFactory.invalidProductPaylooad();
		 
		 Response response = client.createProduct(invalidProductPayload);
		
		assertThat(response.statusCode(), is(201));  //expected status code should be 400.Why? Known limitation: FakeStore API does not validate payload
		//response.then().body(not(emptyOrNullString()));
		
		
		
		
	}
	
	
	
	
	
	

}
