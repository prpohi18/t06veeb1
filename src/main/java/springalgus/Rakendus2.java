package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus2 {
	@RequestMapping("/algus2")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
    
    @RequestMapping("/tervitus2")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
	
	@RequestMapping("/jagatis")
	int korrutamine(int arv1, int arv2){
		return arv1/arv2;
	}
 
    public static void main2(String[] args) {
		//System.getProperties().put("server.port", 48888);
        SpringApplication.run(Rakendus2.class, args);
    }
}
