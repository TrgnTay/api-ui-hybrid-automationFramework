package api.client;

import api.config.ApiSpecFactory;
import api.models.Product;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class FakeStoreClient {
	
	public Response getAllPrducts(){
		
		return given().spec(ApiSpecFactory.get()).when().get("/products");
		
		
		
		
	}
	public Response createProduct(Product prdct) {
		
		return given().spec(ApiSpecFactory.get())
		.body(prdct)
		.when().post("/products");
		
		
		
		
	}
	
	

}
