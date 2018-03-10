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
			String vastus;
			if(a==0 or b==0 or c==0){
				vastus = ("Lahend puudub, sisend ei tohi olla null");
			}else{
				int x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) ) / (2 * a);
				int x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) ) / (2 * a);
				vastus = ("X1 = "+ x1", X2 = "+ x2);
			}
			return vastus;
		}
		
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
