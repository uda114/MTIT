package com.sliit.mtit.returnproducts.returnproductservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sliit.mtit.returnproducts.returnproductservice.dto.APCRequset;
import com.sliit.mtit.returnproducts.returnproductservice.dto.APCResponce;
import com.sliit.mtit.returnproducts.returnproductservice.dto.ReturnRequest;
import com.sliit.mtit.returnproducts.returnproductservice.dto.ReturnResponce;

@Service
public class ReturnServiceImpl {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ReturnResponce createReturn(ReturnRequest returnRequest) {
		
		System.out.println("1st mark working");
		
		var apcRequest = new APCRequset();
		apcRequest.setProductName(returnRequest.getProductName());
		apcRequest.setManufactureName(returnRequest.getManufactureName());
		apcRequest.setQuantity(returnRequest.getQuantity());
		apcRequest.setPrice(returnRequest.getPrice());
		
		System.out.println("2st mark working");
		
		String url = "http://localhost:8080/addProducts";
		
		ResponseEntity<APCResponce> aPCResponce =  restTemplate.postForEntity(url, apcRequest, APCResponce.class);
		
		System.out.println("3st mark working");
		
		var returnResponce = new ReturnResponce();
		returnResponce.setProductID(UUID.randomUUID().toString());
		returnResponce.setProductName(returnRequest.getProductName());
		returnResponce.setAddproductID(aPCResponce.getBody().getProductID());
		returnResponce.setQuantity(returnRequest.getQuantity());
		returnResponce.setPrice(returnRequest.getPrice());

		System.out.println("4st mark working");
		
		return returnResponce;
		
	}
	
	@Bean
	public RestTemplate resTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	
}
