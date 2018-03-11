package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class RakendusKMI {
	
	@RequestMapping("/kehamassiindeks")
	double kmiarvutus(double kaal, double pikkus){
		return Math.round((kaal/(pikkus*pikkus))* 100d) / 100d;
	}
 
    public static void main3(String[] args) {
		//System.getProperties().put("server.port", 48888);
        SpringApplication.run(RakendusKMI.class, args);
    }
}


//Heroku aadress on https://tund5.herokuapp.com/kmi.html
