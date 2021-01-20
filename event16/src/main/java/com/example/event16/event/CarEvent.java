package com.example.event16.event;

import com.example.event16.model.Car;
import org.springframework.context.ApplicationEvent;

public class CarEvent extends ApplicationEvent {

    private String content;
    private String message;
    private Car    car;

    public CarEvent(Car car, String content, String message) {
        super(car);
        this.car    = car;
        this.content = content;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
