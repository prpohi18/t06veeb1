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
    String tervitus2(String name){
        return "Tere, "+name;
    }
	
	@RequestMapping("/multiply")
	double multiply(double value1, double value2){
		return value1*value2;
	}
	
	@RequestMapping("/kmi")
	String kmi(double weight, double length){
		double bmi = Math.round(((weight/(length*length)) * 1000d) / 1000d);
		String kmi = String.valueOf(bmi);
		if (bmi<19){
			kmi = kmi + ". Oled alakaaluline! ";
		}
		if (bmi>=25){
			kmi = kmi + ". Oled ülekaaluline! ";
		}
		if (bmi>=19 && bmi<25){
			kmi = kmi + ". Oled normaalkaalus. ";
		}
		return "Sinu kehamassiindeks on "+ kmi;
	} 
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}

//heroku link: https://t06veeb1.herokuapp.com/kmiPage.html
