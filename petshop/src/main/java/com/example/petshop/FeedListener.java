package com.example.petshop;

public class FeedListener implements Listener {

    int feedCriteria = 0; // 언제 먹이를 줘야하는 지에 대한 경계값

    public FeedListener(int criteria){
        this.feedCriteria = criteria;
    }

    @Override
    public void energyChanged(int energy){
        if(energy < feedCriteria){
            System.out.println("please feed some food.");
        }
    }   
}