package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Liigaasta {
    
    protected String onLiigaasta;
	
	@RequestMapping("/liigaasta")
	String liigaasta(int aasta) {
        if ((aasta % 4) == 0) {
            if (aasta % 100 == 0) {
                if (aasta % 400 == 0) {
                    onLiigaasta = "on";
                } else {
                    onLiigaasta = "ei ole";
                }
            } else {
                onLiigaasta = "on";
            }
        } else {
            onLiigaasta = "ei ole";
        }
		return "See " + onLiigaasta + " liigaasta.";
	}
    
    public static void main(String[] args) {
		System.getProperties().put("server.port", 40404);
        SpringApplication.run(Liigaasta.class, args);
    }
}