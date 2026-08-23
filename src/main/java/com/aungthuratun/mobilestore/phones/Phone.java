package com.aungthuratun.mobilestore.phones;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Phone {
    @Id
    @SequenceGenerator(
        name = "phone_sequence",
        sequenceName = "phone_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "phone_sequence"
    )
    private long id;
    private String name;
    private int ramsize;
    private long price;

    public Phone(){}

    public Phone(long id,String name,int ramsize,long price){
        this.id = id;
        this.name = name;
        this.ramsize = ramsize;
        this.price = price;
    }

    public Phone(String name,int ramsize,long price){
        this.name = name;
        this.ramsize = ramsize;
        this.price = price;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
    public Integer getRamSize(){
        return ramsize;
    }

    public Long getPrice(){
        return price;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setRamSize(Integer ramsize){
        this.ramsize = ramsize;
    }

    public void setPrice(Long price){
        this.price = price;
    }
}
