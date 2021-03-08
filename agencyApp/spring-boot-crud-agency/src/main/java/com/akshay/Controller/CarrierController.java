package com.akshay.Controller;

import com.akshay.Entity.PocCarrier;
import com.akshay.Service.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarrierController {
@Autowired
private CarrierService service;

    @PostMapping("/addCarrier")
    public PocCarrier addCarrier(@RequestBody PocCarrier carrier ){
        return service.saveCarrier(carrier);
    }
    @GetMapping("/carriers")
    public List<PocCarrier> findAllProducts(){
        return service.getCarriers();
    }
    @GetMapping("/carrier/{id}")
    public PocCarrier findCarrierById(@PathVariable int id){
        return (PocCarrier) service.getCarrierById(id);
    }
    @DeleteMapping("/deleteCarrier/{c_id}")
    public String deleteCarrier(@PathVariable int c_id){
        return service.deleteCarrier(c_id);
    }










}
