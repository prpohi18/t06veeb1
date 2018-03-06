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
   //http://greeny.cs.tlu.ee:40376/korrutus?arv1=4&arv2=7
   
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
//mvn package
//java -jar -Dserver.port=55557 target/boot3-1.0-SNAPSHOT.jar
//http://greeny.cs.tlu.ee:55557/arv?arv1=6&arv2=8
