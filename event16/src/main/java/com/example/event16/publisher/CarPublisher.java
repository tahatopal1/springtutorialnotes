package com.example.event16.publisher;

import com.example.event16.event.CarEvent;
import com.example.event16.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CarPublisher {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishMainEvent(){
        CarEvent carEvent = new CarEvent(new Car("Ford", "Fiesta", 2017), "Expertise", "On Action");
        eventPublisher.publishEvent(carEvent);
    }
}
