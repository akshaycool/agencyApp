package com.akshay.Service;

import com.akshay.Entity.PocProductsCarrier;
import com.akshay.Repository.ProductsCarrierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Service
public class ProductsCarrierService {
    @Autowired
    private ProductsCarrierRepository repository;


    public PocProductsCarrier saveProduct(PocProductsCarrier products) throws SQLIntegrityConstraintViolationException {
        PocProductsCarrier poc_productsCarrier = repository.save(products);
        return poc_productsCarrier;
    }

    public List<PocProductsCarrier> saveProducts(List<PocProductsCarrier> products){
        return repository.saveAll(products);
    }

    public List<PocProductsCarrier> getProducts(){
        return repository.findAll();
    }

    public PocProductsCarrier getProductById(int p_id){
        return repository.findByProductId(p_id);
    }

    public String deleteProduct(int p_id){
        repository.deleteById(p_id);
        return "carrier removed"+p_id;
    }

}
