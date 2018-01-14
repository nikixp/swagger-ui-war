package com.example.app;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author Niki
 */
public class Greeting {

    @JsonIgnore
    private static AtomicLong idGenerator = new AtomicLong(1);
    
    private long id;
    
    private String message;

    public Greeting() {
    }
    
    public Greeting(String message) {
        this.message = message;
        this.id = idGenerator.getAndIncrement();
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
    
}
