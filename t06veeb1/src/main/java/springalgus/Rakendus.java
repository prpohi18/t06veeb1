package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	@RequestMapping("/korrutus/{arv1}/{arv2}")
	String korrutamine(@PathVariable String arv1, @PathVariable String arv2){
		if(arv1==null){return "esimene arv puudub";}
		int vastus=Integer.parseInt(arv1)*Integer.parseInt(arv2);
		return String.valueOf(vastus);
	}
	
	//http://greeny.cs.tlu.ee:4044/korrutamine.html
	//JAGAMINE
	@RequestMapping("/jagamine/{arv3}/{arv4}")
	String jagamine(@PathVariable String arv3, @PathVariable String arv4){
		if(arv3==null){return "esimene arv puudub";}
		int vastus=Integer.parseInt(arv3)/Integer.parseInt(arv4);
		return String.valueOf(vastus);
	}
	
	
	
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 4044); MUL ON PORT 4044!!
        SpringApplication.run(Rakendus.class, args);
    }
}
