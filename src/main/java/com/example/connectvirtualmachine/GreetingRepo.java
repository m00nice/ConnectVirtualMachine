package com.example.connectvirtualmachine;


import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepo extends JpaRepository<Greeting,Long> {
}
