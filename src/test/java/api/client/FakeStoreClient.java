package api.client;

import api.config.ApiSpecFactory;
import api.models.Product;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.Map;

public class FakeStoreClient {
	
	public Response getAllPrducts(){
		
		return given().spec(ApiSpecFactory.get()).when().get("/products");
		
		
		
		
	}
	public Response createProduct(Product prdct) {
		
		return given().spec(ApiSpecFactory.get())
		.body(prdct)
		.when().post("/products");
				
		
	}
	
	public Response getProductById(int validprodctid) {
		
		return given().spec(ApiSpecFactory.get()).when().get("/products/" + validprodctid);
		
		
		
	}
	

	public Response createProduct(Map<String, Object> invalidPayload) {
		
		return given().spec(ApiSpecFactory.get())
				.body(invalidPayload).post("/products");
		
		
		
		
	}
	
	
	
	
}
