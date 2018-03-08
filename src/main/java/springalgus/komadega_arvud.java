package springalgus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication

public class komadega_arvud {
    @RequestMapping("/liida")
    float liitmine(float arv1, float arv2, float arv3){
        return arv1+arv2+arv3;
    }
}
