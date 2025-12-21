package api.tests;

import org.testng.annotations.Test;

import api.client.FakeStoreClient;
import api.models.Product;
import api.utils.TestDataFactory;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Th efollowing test cases are covered:
 * TC-API-PRDCT-001 – Get all products
 * TC-API-PRDCT-002 – Get product by ID
 * TC-API-PRDCT-003 – Create product with valid payload
 * */

public class ProductPositiveTest {
	
	private final FakeStoreClient client = new FakeStoreClient();
	
	//TC-API-PRDCT-001
	@Test(groups = "api")
	public void shouldRetrieveAllProducts() {
		
		
		Response response =  client.getAllPrducts();
		assertThat(response.statusCode(), is(200));
		assertThat(response.jsonPath().getList("$"), is(not(empty())));
		
			
		}
		
		
	//TC-API-PRDCT-002
	@Test(groups = "api")
	public void shouldRetriveProductByValidId() {
		
		int productValidId = 2;
		Response response = client.getProductById(productValidId);
		
		assertThat(response.statusCode(), is(200));
		assertThat(response.jsonPath().getInt("id"), equalTo(productValidId));
		assertThat(response.jsonPath().getString("title"), notNullValue());
		
		
		
	}
	//TC-API-PRDCT-003
	@Test(groups = "api")
	public void shouldCreateProductSuccessfully() {
		
		Product request = TestDataFactory.validProduct();
		
		Response response = client.createProduct(request);
		assertThat(response.statusCode(), is(201));
		assertThat(response.jsonPath().getString("title"), equalTo(request.getTitle()));
		assertThat(response.jsonPath().getDouble("price"), closeTo(request.getPrice(), 0.01));
		
		
		
		
	}
	
	
	
	
	
	

}
