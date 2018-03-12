package dennis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Romb {
    @RequestMapping("/pindalaromb")
    int arvutamine(int diag1, int diag2){
        return diag1*diag2;
    }

    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40408);
        SpringApplication.run(Romb.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar

//java -jar -Dserver.port=40408 target/boot3-1.0-SNAPSHOT.jar
