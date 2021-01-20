package com.example.event16.listener;

import com.example.event16.event.CarEvent;
import com.example.event16.model.Car;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CarListener implements ApplicationListener<CarEvent> {
    @Override
    public void onApplicationEvent(CarEvent carEvent) {

        Car car = carEvent.getCar();
        System.out.println("Car desc: ".concat(car.toString()));
        System.out.println("Content: ".concat(carEvent.getContent()));
        System.out.println("Message: ".concat(carEvent.getMessage()));

    }
}
