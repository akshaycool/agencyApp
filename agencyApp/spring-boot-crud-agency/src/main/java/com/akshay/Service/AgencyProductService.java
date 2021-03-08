package com.akshay.Service;

import com.akshay.Entity.PocAgencyProduct;
import com.akshay.Entity.PocCarrier;
import com.akshay.Repository.AgencyProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyProductService {
    @Autowired
    private AgencyProductRepository repository;
    public PocAgencyProduct saveAgencyProduct(PocAgencyProduct agencyProduct){
        return repository.save(agencyProduct);
    }
    public List<PocAgencyProduct> getAgencyProducts(){
        return repository.findAll();
    }
    public Object getAgencyProductById(int agencyProductId){
        return repository.findByAgencyProductId(agencyProductId);
    }
    public String deleteAgencyProduct(int agencyProductId){
        repository.deleteById(agencyProductId);
        return "carrier removed"+agencyProductId;
    }
}
