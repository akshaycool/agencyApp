package com.akshay.Repository;

import com.akshay.Entity.PocAgencyProduct;
import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyProductRepository extends JpaRepository<PocAgencyProduct,Integer> {
    PocAgencyProduct findByAgencyProductId(Integer agencyProductId);
}
