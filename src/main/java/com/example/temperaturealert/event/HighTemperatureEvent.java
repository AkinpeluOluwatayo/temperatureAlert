package com.example.temperaturealert.event;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Getter
@ToString
public class HighTemperatureEvent extends ApplicationEvent {

    private final String sensorId;
    private final double temperature;
    private final String unit;

    public HighTemperatureEvent(Object source, String sensorId, double temperature, String unit) {
        super(source);
        this.sensorId = sensorId;
        this.temperature = temperature;
        this.unit = unit;
    }
}
