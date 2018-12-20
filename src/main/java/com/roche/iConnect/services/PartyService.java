package com.roche.iConnect.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.Date;

@RestController
@RequestMapping("/iconnectparty")
public class PartyService {
    @RequestMapping("/party")
    public ResponseEntity party(){
        return ResponseEntity.ok("Got from party service..."+new Date());
    }
}
