package springalgus;

import java.lang.Math;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
    
    @RequestMapping("/korrutus")
    double korrutamine(int arv1, int arv2){
        double result = Math.pow(arv1, arv2);
        return result;
    }
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
