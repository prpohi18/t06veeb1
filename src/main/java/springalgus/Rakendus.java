package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Hello";
    }

    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }

	@RequestMapping("/korrutus/{arv1}/{arv2}")
	String korrutamine(@PathVariable String arv1, @PathVariable String arv2){
		if(arv1==null){return "esimene arv puudu";}
		int vastus=Integer.parseInt(arv1)*Integer.parseInt(arv2);
		return String.valueOf(vastus);
	}

	@RequestMapping("/risttahukas/{arv1}/{arv2}/{arv3}")
	String lahendamine(@PathVariable String arv1, @PathVariable String arv2, @PathVariable String arv3){
		if(arv1==null){return "esimene arv puudu";}
		int vastus1=2*(Integer.parseInt(arv1)*Integer.parseInt(arv2)+(Integer.parseInt(arv1)*Integer.parseInt(arv3)+ (Integer.parseInt(arv2)*Integer.parseInt(arv3));
		return String.valueOf(vastus1);
	}

    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
