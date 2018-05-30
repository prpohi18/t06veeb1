package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
    @RequestMapping("/pythagoras")
    double pyth(double kaatet1, double kaatet2){
        double hüpotenuus= Math.sqrt(Math.pow(kaatet1, 2) + Math.pow(kaatet2, 2));
        hüpotenuus = Math.round(hüpotenuus * 1000D) / 1000D;
        return hüpotenuus;
    }

    @RequestMapping("/pindala")
    double pind(double kaatet1, double kaatet2){
        double pindala= kaatet1 * kaatet2 / 2;
        return pindala;
    }

    @RequestMapping("/ümbermõõt")
    double ümber(double kaatet1, double kaatet2){
        double hüpotenuus= Math.sqrt(Math.pow(kaatet1, 2) + Math.pow(kaatet2, 2));
        hüpotenuus = Math.round(hüpotenuus * 1000D) / 1000D;
        double ümbermõõt = hüpotenuus + kaatet1 + kaatet2;
        return ümbermõõt;
    }
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40905);
        SpringApplication.run(Rakendus.class, args);
    }
}

//java -jar -Dserver.port=40910 target/boot3-1.0-SNAPSHOT.jar