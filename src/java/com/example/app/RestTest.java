package com.example.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Niki
 */
@RestController
public class RestTest {
    
    @CrossOrigin
    @RequestMapping(value = "/test/{message}", method = RequestMethod.GET)
    public ResponseEntity startJournal(@PathVariable(name = "message") String message) throws Exception {
        return new ResponseEntity<>(new Greeting(message), HttpStatus.OK);
    }
    
}