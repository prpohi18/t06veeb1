package springalgus;
import java.lang.Math;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.lang.Double;
@RestController
@SpringBootApplication
public class Rakendus {
    @RequestMapping("/nnPyraRuumala")
    double ruumala(double pserv, double korgus){
        double V = 1.0/3.0 * Math.pow(pserv, 2) * korgus;
		return V;
    }

    public static void main(String[] args) {
        SpringApplication.run(Rakendus.class, args);
    }
}