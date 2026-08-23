package com.aungthuratun.mobilestore.phones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(path = "api/v1/phone")
public class PhoneController {

    private final PhoneService phoneService;

    @Autowired
    public PhoneController(PhoneService phoneService){
        this.phoneService = phoneService;
    }
    
    @GetMapping
    public List<Phone> getPhones(){
        return phoneService.getPhones();
    }

    @PostMapping
    public void registerNewPhone(@RequestBody Phone new_phone){
  
        phoneService.addNewPhone(new_phone);
    }

    @DeleteMapping(path={"/{phone_id}"})
    public void deletePhone(@PathVariable("phone_id") Long id){
        phoneService.deletePhone(id);
    }

    @PutMapping(path={"/{phone_id}"})
    public void updatePhone(@PathVariable("phone_id") Long id,
                            @RequestParam(required = false) String name,
                            @RequestParam(required = false) Integer ramsize,
                            @RequestParam(required = false) Long price){
        phoneService.updatePhone(id, name, ramsize, price);
    }

    
}
