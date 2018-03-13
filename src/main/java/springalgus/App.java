package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class App {
    @RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }

    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
    // /tervitus?eesnimi=Daisy

    @RequestMapping("/korrutis")
    double kord(int num1, int num2) {
        return num1*num2;
    }

    @RequestMapping("/perc")
    double percentage(double b1, double b2) {
        return (b1/b2)*100;
    } // http://javaspringboot.herokuapp.com/percentage.html

    public static void main(String[] args) {
        //System.getProperties().put("server.port", 40305);
        SpringApplication.run(App.class, args);
    }
}
