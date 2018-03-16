package springalgus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication

public class Rakendus {
    @RequestMapping("/ruutvorrand")
    String korrutamine(int arv1, int arv2){
        String vastus = "vastus";
        int vaartus = (int) ((arv1*arv2)/2);
            return vastus;
        
            
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(Rakendus.class, args);
    }
    
}