/*
1) Spring Boot - repo (Jaagupilt failid (https://github.com/jaagup/t06veebneljapaev), siis tõmbad selle endale Netbeansi niing Run>Clean and Build
2) Paned tööle ja siis brauseris aadressi ribale: 
    http://localhost:8080/tervitus?eesnimi=Juku ning ütleb, Tere, Juku
    http://localhost:8080/algus ning ütleb Ahoi!
3) Netbeansi alt (Run(Rakendus)) ristist kinni ja uuesti RUN
4) Herokusse konto ja sealt panid githubi repo kylge ning kuvasid repos olevat 
    appi l2bi heroku. K2tte sain aadressilt: https://springalguskaur.herokuapp.com/algus
5) Tegin HTML faili Netbeansis failide alla boot3>src>main> resources>public>kirjeldus.html 
    ning brauseris sain selle k2tte aadressil http://localhost:8080/kirjeldus.html
6) Jaagup tegi ylesande lahenduse.




*/
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
