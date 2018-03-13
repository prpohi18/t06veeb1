
package com.mycompany.kodunetoo6;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class rakendus {
   
    @RequestMapping("/ruutvorrand")
    String korrutamine(int arv1, int arv2,int arv3){
        String vastus = "vastus";
        int vaartus = (int) (Math.pow(arv2,2) - 4 * arv2 * arv3);
            if(arv1 == 0){
                vastus = "See ei ole ruutvõrrand";
            }else if( vaartus>= 0){

                int x1 = (int) ((-arv2 + Math.sqrt(Math.pow(arv2,2) - 4 * arv1 * arv3))/(2 * arv1));
                int x2 = (int) ((-arv2 - (Math.sqrt(Math.pow(arv2,2) - 4 * arv1 * arv3)))/(2 * arv1));
                vastus = "Ruutvõrrandi lahendid on "+ x1 +" ja "+x2;
        }else{
                vastus = "Reaalarvulised lahendid puuduvad";
            } 





            return vastus;
        //http://localhost:8080/korrutus?arv1=3&arv2=5
    }
    
    
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(rakendus.class, args);
    }
    
}

