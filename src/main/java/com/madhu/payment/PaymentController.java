package com.madhu.payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping
    public ResponseEntity<?> create (@RequestBody Map<String , Object> req){
        return  ResponseEntity.status(201).body(Map.of(
                "id" , UUID.randomUUID().toString() ,
                "Status" , "PENDING"));
    }
}
