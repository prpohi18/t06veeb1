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
		int korrutamine(int arv1, int arv2){
			return arv1*arv2;
		}
	
	@RequestMapping("/ruutvorrand")
		int lahendamine(int a, int b, int c){
			int d = (pow(b, 2) - (4 * a * c));
			int x1, x2;
			if (d >= 0) {
				x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) ) / (2 * a);
				x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) ) / (2 * a);
				return "X1 = " + x1 + " X2 = " + x2;
			} else {
				return "Ülesandel puuduvad lahendid";
			}
		}
		
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
