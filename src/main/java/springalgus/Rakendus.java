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
        return "Hommikust!";
    }
    
    @RequestMapping("/tervitus") //Get'iga tavaline küsimine
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    } //http://greeny.cs.tlu.ee:36770/tervitus?eesnimi=Grete
	
	@RequestMapping("/korrutus/{arv1}/{arv2}")
	String korrutamine(@PathVariable String arv1, @PathVariable String arv2){
		if(arv1==null){return "esimene arv puudub";}
		int vastus=Integer.parseInt(arv1)*Integer.parseInt(arv2);
		return String.valueOf(vastus);
	} ////http://greeny.cs.tlu.ee:36770/korrutus/4/7
		//http://greeny.cs.tlu.ee:36770/korrutus?arv1=4&arv2=7

	//Kehamassiindeks:	
	@RequestMapping("/kmindeks/{pikkus}/{kaal}")
	String arvutamine(@PathVariable String pikkus, @PathVariable String kaal){
		if(pikkus==null){return "arv puudub";}
		double pikkusRuut=Math.pow((Double.parseDouble(pikkus)/100),2);
		double kmi=(Integer.parseInt(kaal)*1.0) / pikkusRuut;
		return String.valueOf(kmi);
	}
	
	

 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
