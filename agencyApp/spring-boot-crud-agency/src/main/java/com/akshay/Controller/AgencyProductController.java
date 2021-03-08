package com.akshay.Controller;

import com.akshay.Entity.PocAgencyProduct;
import com.akshay.Entity.PocCarrier;
import com.akshay.Service.AgencyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgencyProductController {
    @Autowired
    private AgencyProductService service;
    @PostMapping("/addAgencyProduct")
    public PocAgencyProduct addAgencyProduct(@RequestBody PocAgencyProduct agencyProduct ){
        return service.saveAgencyProduct(agencyProduct);
    }
    @GetMapping("/agencyProducts")
    public List<PocAgencyProduct> findAllAgencyProduct(){
        return service.getAgencyProducts();
    }
    @GetMapping("/agencyProductsById/{id}")
    public PocAgencyProduct findAgencyProductById(@PathVariable int id){
        return (PocAgencyProduct) service.getAgencyProductById(id);
    }
    @DeleteMapping("/deleteAgencyProduct/{id}")
    public String deleteAgencyProduct(@PathVariable int id){
        return service.deleteAgencyProduct(id);
    }
}
