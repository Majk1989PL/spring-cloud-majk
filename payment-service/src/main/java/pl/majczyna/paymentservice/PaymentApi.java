package pl.majczyna.paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApi {
    @GetMapping()
    public String hello(){

        return "hello world from PaymentApi!";
    }
}
