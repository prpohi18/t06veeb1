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
    @RequestMapping("/korrutis")
    int korrutis(int arv1, int arv2){
        return arv1 * arv2;
    }
    @RequestMapping("/t06")
    String BMI(Double height, Double weight){
            return BMIfind(height, weight);
}
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }

    public String BMIfind(Double Height, Double Weight){
        String answer = "Fail";
        String[] answers={"Alakaal","Normaalkaal","Ülekaal","Rasvumine"};
        Double BMI = (Weight/((Height/100)*(Height/100)));
        answer=Double.toString(BMI);
        if(BMI<18.5){
            answer=answers[0];
        }else if(BMI>=18.5 && BMI<=25){
            answer=answers[1];
        }else if(BMI>25 && BMI<29.9){
            answer=answers[2];
        }else if(BMI>30){
            answer=answers[3];
        }
        return answer;
    }
}
