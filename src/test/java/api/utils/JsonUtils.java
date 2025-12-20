package api.utils;

import io.restassured.response.Response;

public class JsonUtils {

	
	public static<T> T get (Response response, String pathh) {
		
		return response.jsonPath().get(pathh);
		
		
		
		
	}
	
	
	
	
}
