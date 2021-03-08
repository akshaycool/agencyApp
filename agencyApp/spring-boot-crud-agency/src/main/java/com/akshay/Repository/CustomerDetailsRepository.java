package com.akshay.Repository;

import com.akshay.Entity.PocCustomerDetails;
import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepository extends JpaRepository<PocCustomerDetails,Integer> {
    PocCustomerDetails findByCustomerId(Integer customerDetailsId);
}
