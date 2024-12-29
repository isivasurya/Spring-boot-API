package com.project.ApiCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ApiCRUD.models.AllproductList;

@Repository
public interface ProdRepository extends JpaRepository<AllproductList,Integer> {

}
