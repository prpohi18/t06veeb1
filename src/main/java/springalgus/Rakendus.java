package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {

	@RequestMapping("/korrutus")
	int korrutamine(int arv1, int arv2){
		return arv1*arv2;
	}
	@RequestMapping("/KMI")
	double kehamassiindeks(float pikkus, float kaal){
		return kaal/((pikkus/100)*(pikkus/100));
	}
 
    public static void main(String[] args) {
		/*System.getProperties().put("server.port", 42014);*/
        SpringApplication.run(Rakendus.class, args);
    }
}
// https://maiste6.herokuapp.com/korrutusleht.html



//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar

//java -jar -Dserver.port=42014 target/boot3-1.0-SNAPSHOT.jar
