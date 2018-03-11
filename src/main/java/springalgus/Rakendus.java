package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus{
	@RequestMapping("/pindala")
	double korrutamine(double arv1){
		return (arv1*arv1*3.14);
	}
	
    public static void main(String[] args){
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}

//java -jar  -Dserver.port=11503 target/boot3-1.0-SNAPSHOT.jar
