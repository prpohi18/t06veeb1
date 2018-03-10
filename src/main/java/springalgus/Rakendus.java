package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {

    @RequestMapping("/tere")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }

    @RequestMapping("/")
    String rootFolder(){
        return "page!";
    }
    @RequestMapping("/korrutis")
    int korrutis(int arv1, int arv2){
        return arv1 * arv2;
    }
    @RequestMapping("/t06")
    String macAddress(String mac){
        if ((mac.length()==17 || mac.length()==8) && mac.substring(2,3).equals(":") && mac.substring(5,6).equals(":")){
            return macConvert(mac);
        }
        return "Sisesta andmed õigel kujul";
    }
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
    public String macConvert(String macVendor){
        String aadress = macVendor.substring(0, 8);
        String vastus = "Andmed puuduvad";
        String[] aadressid={"00:e0:4c","00:23:DF","00:16:6B"};
        String[] vendor={"Realtek Semiconductor corp.", "Apple inc.", "Samsung Electronics"};
        for (int i=0; i < 3;i++ ) {
          if (aadress.equalsIgnoreCase(aadressid[i])) {
            vastus = vendor[i];
          }
        }
        return vastus;
      }
}

//java -jar -Dserver.port=8008 target/boot3-1.0-SNAPSHOT.jar

