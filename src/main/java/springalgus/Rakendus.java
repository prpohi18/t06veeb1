//  http://t06veeb1kaur.herokuapp.com/index.html

package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
@SpringBootApplication
public class Rakendus {

    //arvutan risttahuka ruumala vastavalt veebist saadud arvudele 
    @RequestMapping("/risttahukaruumala")
    int korrutamine(int arv1, int arv2, int arv3){
       return arv1*arv2*arv3;
    }

    public static void main(String[] args) {
        SpringApplication.run(Rakendus.class, args);
    }
}
