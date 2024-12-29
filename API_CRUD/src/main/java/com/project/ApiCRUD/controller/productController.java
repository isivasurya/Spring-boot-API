package com.project.ApiCRUD.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ApiCRUD.models.AllproductList;
import com.project.ApiCRUD.services.services;

@RestController
@RequestMapping("/allproducts")
public class productController {
	
	@Autowired
	private services services;
	
	@GetMapping
	public List<AllproductList> getAllprods() {
		return services.getAllprods();		
	}
	@GetMapping("/getmobiles")
	public List<Map<String, Object>> getmobiles() {
		return Arrays.asList(Map.of("Name","Samsung s22","price",100345),
				Map.of("Name","Iphone 16","price",140000)
				);
	}
}
