package com.roche.iConnect.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PartyService {

    @GetMapping("/party")
    public ResponseEntity party(){
        return ResponseEntity.ok("Got from party service..."+new Date());
    }
    @GetMapping("/")
    public ResponseEntity all(){
        return ResponseEntity.ok("Got from all party service..."+new Date());
    }
}
