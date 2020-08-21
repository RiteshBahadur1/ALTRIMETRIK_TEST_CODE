package com.example;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Stocks;
//@RunWith(SpringRunner.class)
@SpringBootTest
class StockQuoteServiceApplicationTests {

	@LocalServerPort
    int randomServerPort;
	
	@Test
	public void testAddStockSuccess() throws URISyntaxException {
		 RestTemplate restTemplate = new RestTemplate();
	        final String baseUrl = "http://localhost:"+randomServerPort+"/stocks/";
	        URI uri = new URI(baseUrl);
	        Stocks employee = new Stocks("HCL", "HCL Tech", new Date(), "200.80","INR");
	    
	        HttpHeaders headers = new HttpHeaders();
	        headers.set("X-COM-PERSIST", "true");      
	 
	        HttpEntity<Stocks> request = new HttpEntity<>(employee, headers);
	         
	        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
	         
	        //Verify request succeed
	        Assertions.assertEquals(201, result.getStatusCodeValue());
	}

}
