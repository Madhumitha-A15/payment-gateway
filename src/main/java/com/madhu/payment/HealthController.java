package com.madhu.payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // this tells the spring that this handles the web requests
public class HealthController {
    @GetMapping("/health")
    public String health(){
        return "Status : OK";
    }

}
