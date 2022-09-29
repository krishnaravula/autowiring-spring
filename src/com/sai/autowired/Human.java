package com.sai.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Human {
    @Autowired
    @Qualifier("OctopusHeart")
    private Heart heart;


    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("Setter is called");
    }


//    public Human(Heart heart) {
//        this.heart = heart;
//        System.out.println("Constructor is called");
//    }

    public void startPumping() {
        if (heart != null) {
            heart.pump();
            System.out.println("Name of the Animal " + heart.getNameOfAnimal() + " Number of the hearts " + heart.getNoOfHeart());
        } else {
            System.out.println("no heart");
        }
    }

}
