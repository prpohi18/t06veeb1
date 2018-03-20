package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Rakendus6 {
    @RequestMapping("/kehamassiindeks")
    String korrutamine(int arv1, double arv2) {
        String vastus;
        double vaartus = (arv1/Math.sqrt(arv2));
        vastus = "Vastus on: " + vaartus;
            return vastus;
    }
    public static void main(String[] args) {
        SpringApplication.run(Rakendus6.class, args);
    }
    
}
