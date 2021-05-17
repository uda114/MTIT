package com.sliit.mtit.addproducts.addproductservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.addproducts.addproductservice.dto.ProductRequest;
import com.sliit.mtit.addproducts.addproductservice.dto.ProductResponce;

@RestController
@RequestMapping("/addProducts")
public class Controller {

	@PostMapping(consumes = "application/json", produces = "application/json" )
	public @ResponseBody ProductResponce createProduct(@RequestBody ProductRequest productRequest) {
		
		System.out.println("Product Details : "+ productRequest);
		
		var productResponce = new ProductResponce();
		productResponce.setProductID(UUID.randomUUID().toString());
		productResponce.setMessage("This is add product message");
		
		return productResponce;
	}
}
