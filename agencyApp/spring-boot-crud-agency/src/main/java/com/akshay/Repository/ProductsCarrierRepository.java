package com.akshay.Repository;

import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsCarrierRepository extends JpaRepository<PocProductsCarrier,Integer> {

    PocProductsCarrier findByProductId(Integer pid);




}
