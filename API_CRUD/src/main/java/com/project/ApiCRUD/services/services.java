package com.project.ApiCRUD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ApiCRUD.models.AllproductList;
import com.project.ApiCRUD.repository.ProdRepository;

@Service
public class services {
		
	@Autowired
	private ProdRepository prepo;
	
	public List<AllproductList> getAllprods(){
		return prepo.findAll();
		
	}
}
