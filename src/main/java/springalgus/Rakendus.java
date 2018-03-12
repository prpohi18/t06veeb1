package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/arvutaPindala")
    String pindalafunktsioon(double value1, double value2, double value3) {
        if value1 + value2 > value3 & value1 + value3 > value2 & value2 + value3 > value1{
			double pindala = (value1 * value2 * value3)/2;
			pindalaFunktsioon = pindala;
		else {
			pindalafunktsioon = "Ei ole kolmnurk!";
		}
		return "Kolmnurga pindala on "+ pindalaFunktsioon;
    }
	}
   
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
