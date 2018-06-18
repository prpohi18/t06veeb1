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
	
	@RequestMapping("/korrutus")
	int korrutis(int arv1, int arv2) {
		return arv1*arv2;
	}
		
	@RequestMapping("/arvutus")
	double arvutus(double reps, double weight) {
		if (reps>1){
			return (weight*(1+(reps/30)));
		} else {
			return 0;
		}			
	}
 
    public static void main(String[] args) {
		SpringApplication.run(Rakendus.class, args);
    }
}

//System.getProperties().put("server.port", 40355);