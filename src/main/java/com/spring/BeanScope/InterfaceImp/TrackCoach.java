package com.spring.BeanScope.InterfaceImp;

import org.springframework.stereotype.Component;

import com.spring.BeanScope.Interface.Coach;

@Component
public class TrackCoach implements Coach {

    //adding noArg Const for this class
public TrackCoach(){
    System.out.println("In Constructor: " +getClass().getSimpleName());
}


    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }
    
}
