package com.example.petshop;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet {

    abstract public void speak();

    List<Listener> listeners = new ArrayList<Listener>();
    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    private int energy = 0;
        public int getEnergy(){
            return energy;
        }
        protected void setEnergy(int energy){
            if(Math.abs(this.energy - energy) < 3)
                this.energy = energy;
            else
                throw new IllegalArgumentException("Energy change is too big");
        }

        public void eat(){
            energy++;
    
            if(listeners!=null){
                for(int i = 0; i<listeners.size(); i++){
                        listeners.get(i).energyChanged(energy);
                }
            }
        }
    
        public void sleep(){
            energy += 3;
    
            if(listeners!=null){
                for(int i = 0; i<listeners.size(); i++){
                        listeners.get(i).energyChanged(energy);
                }
            }
        }
    
        public void groom(){
            energy += 2;
    
            if(listeners!=null){
                for(int i = 0; i<listeners.size(); i++){
                        listeners.get(i).energyChanged(energy);
                }
            }
        }
    
        public String toString(){
            return "<a href='./"+this.getClass().getSimpleName().toLowerCase()+"'"+ ">" + this.getClass().getSimpleName() + "</a>";
        }
        
    }
    
