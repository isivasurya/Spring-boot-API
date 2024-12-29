package com.project.ApiCRUD;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.ApiCRUD.models.AllproductList;
import com.project.ApiCRUD.repository.ProdRepository;

@Component
public class DataSeeder implements CommandLineRunner {
		
	
	@Autowired
	private ProdRepository pr;
	@Override
	public void  run(String ...args)throws Exception{
		
		if(pr.count()==0) {
			
			List<AllproductList> products = Arrays.asList(
				    new AllproductList( "Mobile", 235000.50, "A handheld device", 4.2, "Apple Inc", "Iphone 16", 20, 25),
				    new AllproductList( "Laptop", 35000.50, "A Lapheld device", 4.2, "Dell Inc", "Dell Inspiron", 35, 25),
				    new AllproductList( "Ornaments", 235.50, "To make your hands beauty", 4.8, "Bestis", "Bestie Bracelet", 200, 25)
				);
			pr.saveAll(products);
			System.out.println("Demo data inserted/seeded");
		}
		
	}
	
}
