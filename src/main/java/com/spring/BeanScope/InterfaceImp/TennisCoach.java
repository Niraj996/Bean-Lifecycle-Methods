package com.spring.BeanScope.InterfaceImp;

//import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.spring.BeanScope.Interface.Coach;

@Component

public class TennisCoach implements Coach {

//adding noArg Const for this class
public TennisCoach(){
    System.out.println("In Constructor: " +getClass().getSimpleName());
}

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    
}
