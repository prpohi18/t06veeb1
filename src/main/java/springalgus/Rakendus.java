package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
@SpringBootApplication
public class Rakendus {

    @RequestMapping("/korrutus")
    int korrutamine(int arv1, int arv2){
       return arv1*arv2;
    }

    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
