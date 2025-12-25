package api.utils;

import java.util.HashMap;
import java.util.Map;

import api.models.Product;

public class TestDataFactory {
	
	public static Product validProduct() {
		
		 Product p = new Product();
		 p.setTitle("QA automation Ebook");
		 p.setPrice(25.99);
		 p.setDescription("senior qa guide");
		 p.setCategory("books");
		 p.setImage("https://img.com/ebook.png");
		
		return p;
		
		
	}
	
	
	public static Map<String, Object> invalidProductPaylooad(){
		
		Map<String, Object> map = new HashMap<>();
		map.put("title", "");
		map.put("price", "invalidprice");
		return map;
		
		
		
		
	}
	
	
	

}
