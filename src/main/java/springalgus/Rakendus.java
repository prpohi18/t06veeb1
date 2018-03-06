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
        return "Teretere!";
    }
	//http://greeny.cs.tlu.ee:4044/tervitus?eesnimi=juku
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
	
	//http://greeny.cs.tlu.ee:4044/korrutis?arv1=3&arv2=4
	@RequestMapping("/korrutis")
	int korrutamine(int arv1, int arv2){
		return arv1*arv2;
	}
	
	
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 4044); MUL ON PORT 4044!!
        SpringApplication.run(Rakendus.class, args);
    }
}
