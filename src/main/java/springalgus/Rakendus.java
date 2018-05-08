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
    
    @RequestMapping("/ymbermoot")
    double ymbermoot(int kylg1, int kylg2){
        double result = 2*(kylg1) + 2*(kylg2);
        return result;
     }
    
    @RequestMapping("/pindala")
    double pindala(int kylg1, int kylg2){
        double result = kylg1 * kylg2;
        return result;
     }

    //https://janristkylik.herokuapp.com/
	
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40306);
        SpringApplication.run(Rakendus.class, args);
    }
}