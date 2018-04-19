package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
    @RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
    
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
    
    @RequestMapping("/liitmine")
    double liitmine(int arv1, int arv2){
        double result = arv1 + arv2;
        return result;
     }
    
    @RequestMapping("/lahutamine")
    double lahutamine(int arv1, int arv2){
        double result = arv1 - arv2;
        return result;
     }
    
    @RequestMapping("/korrutamine")
    double korrutamine(int arv1, int arv2){
        double result = arv1 * arv2;
        return result;
     }
    
    @RequestMapping("/jagamine")
    double jagamine(int arv1, int arv2){
        double result = arv1 / arv2;
        return result;
     }
    
    //heroku link koduneteet.herokuapp.com
    
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40306);
        SpringApplication.run(Rakendus.class, args);
    }
}
