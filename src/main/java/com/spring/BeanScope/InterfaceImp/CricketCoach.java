package com.spring.BeanScope.InterfaceImp;

import org.springframework.stereotype.Component;

import com.spring.BeanScope.Interface.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component // It markes the class as a Spring Bean (makes ava for dependency injection)

public class CricketCoach implements Coach {

    //adding noArg Const for this class
public CricketCoach(){
    System.out.println("In Constructor: " +getClass().getSimpleName());
}

//define our init method -> After running this method gets started as ->  In doMyStartupStuff(): CricketCoach
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): " +getClass().getSimpleName());
    }

//define our destroy method -> after closing the app, method gets destroyed -> In doMyCleanupStuff(): CricketCoach
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff(): " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min ";
       
    }
    
}
