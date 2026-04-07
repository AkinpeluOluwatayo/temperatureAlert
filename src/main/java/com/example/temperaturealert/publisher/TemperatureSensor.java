package com.example.temperaturealert.publisher;

import com.example.temperaturealert.event.HighTemperatureEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TemperatureSensor {

    private final ApplicationEventPublisher eventPublisher;

    public void sendReading(String sensorId, double temperature) {
        HighTemperatureEvent event = new HighTemperatureEvent(this, sensorId, temperature, "C");
        eventPublisher.publishEvent(event);
    }
}
