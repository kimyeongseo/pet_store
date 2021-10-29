package com.example.petshop;

import java.io.Serializable;

public class Cat extends Pet implements Groomable, Serializable, Runnable {

    @Override
    public void speak(){

        if(getEnergy() < 5){
            System.out.println("I am hungry");
        }else{
            System.out.println("Hi");
        }
    }

    @Override
    public String grooming(){
        return "야옹 행복 집사여";
    }

    
    @Override
    public void run() {
        System.out.println("I am running");
        
    }
    
    
}
