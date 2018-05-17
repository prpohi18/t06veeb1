package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
    
    @RequestMapping("/jagamine")
    float korrutamine(float arv1, float arv2){
        return arv1/arv2;
    }
    
    @RequestMapping("/lahutamine")
    public int arvudeLiitmine(String sisu){
        String[] m=sisu.split(",");
        int vahe=100;
        for(int i=0; i<m.length; i++){
            vahe-=Integer.parseInt(m[i].trim());
        }
        return vahe;
        
    }
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
