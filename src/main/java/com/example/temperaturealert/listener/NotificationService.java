package com.example.temperaturealert.listener;

import com.example.temperaturealert.event.HighTemperatureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @EventListener
    public void handleHighTemp(HighTemperatureEvent event) {
        System.out.println("=".repeat(50));
        System.out.println("[ALERT] High Temperature Detected!");
        System.out.println("Sensor  : " + event.getSensorId());
        System.out.println("Reading : " + event.getTemperature() + "°" + event.getUnit());
        System.out.println("Action  : Dispatching maintenance team immediately.");
        System.out.println("=".repeat(50));
    }
}
