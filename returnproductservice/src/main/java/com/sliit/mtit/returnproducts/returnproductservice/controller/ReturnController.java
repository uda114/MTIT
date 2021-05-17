package com.sliit.mtit.returnproducts.returnproductservice.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.returnproducts.returnproductservice.dto.ReturnRequest;
import com.sliit.mtit.returnproducts.returnproductservice.dto.ReturnResponce;
import com.sliit.mtit.returnproducts.returnproductservice.service.ReturnServiceImpl;

@RestController
@RequestMapping("/returnProducts")
public class ReturnController {

	@Autowired
	private ReturnServiceImpl returnServiceImpl;
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody ReturnResponce createReturn(@RequestBody ReturnRequest returnRequest) {
		
		System.out.println("Return Details : "+ returnRequest);
		
		
		
		//return returnResponce;
		return returnServiceImpl.createReturn(returnRequest);
		
	}
}
