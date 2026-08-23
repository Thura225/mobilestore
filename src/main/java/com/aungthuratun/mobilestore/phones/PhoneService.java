package com.aungthuratun.mobilestore.phones;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class PhoneService {

    private final PhoneRepository phoneRepository;

    @Autowired
    PhoneService(PhoneRepository phoneRepository){
        this.phoneRepository = phoneRepository;
    }
    public List<Phone> getPhones(){
        return phoneRepository.findAll();
    }

    public void addNewPhone(Phone phone){
        Optional<Phone> new_phone_name = phoneRepository.findPhoneByName(phone.getName());
        if(new_phone_name.isPresent()){
            throw new IllegalStateException("Existing phone name");
        }
        System.out.println(phone);
        phoneRepository.save(phone);
    }

    public void deletePhone(Long id){
        boolean exists = phoneRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Phone does not exists");
        }

        phoneRepository.deleteById(id);
    }

    @Transactional
    public void updatePhone(Long id, String name, Integer ramsize, Long price){
        Phone phone = phoneRepository.findById(id).orElseThrow(()-> new IllegalStateException("Can't find phone with " + id));

        if(name != null && name.length() > 0 && !Objects.equals(phone.getName(),name)){
            phone.setName(name);
        }

        if(ramsize != null && ramsize > 0 && !Objects.equals(phone.getRamSize(),ramsize)){
            phone.setRamSize(ramsize);
        }

        if(price != null && price > 0 && !Objects.equals(phone.getPrice(),price)){
            phone.setPrice(price);
        }

        
    }

}
