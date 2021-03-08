package com.akshay.Service;

import com.akshay.Entity.PocCarrier;
import com.akshay.Repository.CarrierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrierService {
    @Autowired
  private CarrierRepository repository;

    public PocCarrier saveCarrier(PocCarrier carrier){
        return repository.save(carrier);
    }
    public List<PocCarrier> saveCarriers(List<PocCarrier> carrier){
        return repository.saveAll(carrier);
    }

    public List<PocCarrier> getCarriers(){
        return repository.findAll();
    }

    public Object getCarrierById(int c_id){
        return repository.findByCarrierId(c_id);
    }

    public String deleteCarrier(int c_id){
        repository.deleteById(c_id);
        return "carrier removed"+c_id;
    }




}
