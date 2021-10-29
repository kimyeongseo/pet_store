package com.example.petshop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Cart implements ICart {
    
    List<Pet> pets = new ArrayList<Pet>();

    public Cart(){
    }

    @Override
    public Pet add(Pet pet) throws Exception {
        pets.add(pet);

        return pet;
    }

    @Override
    public Pet remove(Pet pet) throws Exception {
        pets.remove(pet);

        return pet;
    }
}
