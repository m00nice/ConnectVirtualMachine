package com.example.connectvirtualmachine;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private GreetingRepo greetingRepo;


    public Controller(GreetingRepo greetingRepo) {
        this.greetingRepo = greetingRepo;
    }
    @GetMapping("/")
    public ResponseEntity<Greeting> greeting(){
        Greeting greeting = new Greeting("yo whattup server");
        greetingRepo.save(greeting);
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
