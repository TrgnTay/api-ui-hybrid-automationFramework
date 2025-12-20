package api.config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utils.ConfigReader;
//import static io.restassured.http.ContentType.JSON;   
public class ApiSpecFactory {
	
	
	private static RequestSpecification spec;
	
	public static RequestSpecification get() {
		
		if(spec == null) {    //lazy initialization
			
			spec = new RequestSpecBuilder().setBaseUri(ConfigReader.get("api_baseUrl"))
					.setContentType(ContentType.JSON).build();
			
			
			
			
		}
		
		
		
		
		return spec;  
		
		
	}
	
	
	
	
	
	

}
