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
    float korrutamine(float arv1, float arv2){
        return arv1*arv2;
    }
    
    @RequestMapping("/summa")
    public int arvudeLiitmine(String sisu){
        String[] m=sisu.split(",");
        int summa=0;
        for(int i=0; i<m.length; i++){
            summa+=Integer.parseInt(m[i].trim());
        }
        //return summa;
        
        return java.util.Arrays.stream(sisu.split(",")).
                mapToInt(s -> Integer.parseInt(s.trim())).sum();
    }
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
