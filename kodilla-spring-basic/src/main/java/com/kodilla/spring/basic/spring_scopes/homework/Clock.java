package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
@Scope("prototype")  // 🔥 Kluczowa adnotacja dla poprawnego działania testu!
public class Clock {
    private final LocalTime time = LocalTime.now();

    public LocalTime getTime() {
        return time;
    }
}