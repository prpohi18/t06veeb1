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
        return "Ahoi!!";
    }
    
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
     @RequestMapping("/korrutus")
     int korrutamine(int arv1, int arv2){
         return arv1*arv2;
     }
     @RequestMapping("/testsumma")
     int summeerimine(String arvud){
         int summa = 0;
         String[] m = arvud.split(",");
         for(int i=0; i<m.length;i++){
             summa = summa+ Integer.parseInt(m[i]);
         }
     return summa;
     }
     
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
