package com.example.temperaturealert;

import com.example.temperaturealert.publisher.TemperatureSensor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {

    private final TemperatureSensor sensor;

    @Override
    public void run(String... args) {
        sensor.sendReading("SENSOR-01", 95.5);
        sensor.sendReading("SENSOR-02", 38.2);
        sensor.sendReading("SENSOR-03", 102.0);
    }
}
