package com.akshay.Controller;

import com.akshay.AgencyResponse;
import com.akshay.Entity.PocProductsCarrier;
import com.akshay.Service.ProductsCarrierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
@Slf4j
@RestController
public class ProductsCarrierController {
    @Autowired
    private ProductsCarrierService service;

    @PostMapping("/addProductCarrier")
    public AgencyResponse addProduct(@RequestBody PocProductsCarrier products )
    {
        PocProductsCarrier tmp=null;
        AgencyResponse response=new AgencyResponse();
        try{
            tmp =  service.saveProduct(products);
        }catch(SQLIntegrityConstraintViolationException exw){
            System.out.println("eRROR WHILE SAVING " + exw);
            response.setStatus("fail");
            response.setData(null);
            response.setMessage("Added duplicate");
            return response;
        }

        //POC1_Products products1

        List list=  new ArrayList<>();
        list.add(tmp);

        response.setStatus("Success");
        response.setData(list);
        response.setMessage("Product ADded successfully");


        return response;


    }
    @GetMapping("/products")
    public List<PocProductsCarrier> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public PocProductsCarrier findProductById(@PathVariable int id){
        return (PocProductsCarrier) service.getProductById(id);
    }
    @DeleteMapping("/deleteProducts/{p_id}")
    public String deleteProduct(@PathVariable int p_id){
        return service.deleteProduct(p_id);
    }





}
