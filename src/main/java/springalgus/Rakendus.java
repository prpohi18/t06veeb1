package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
  @RestController
  @SpringBootApplication
  public class Rakendus {
  @RequestMapping("/algus")
  String tervitusfunktsioon() {
    return "hello";
  }

  @RequestMapping("/tervitus")
  String tervitus2(String eesnimi){
    return "Tere, "+eesnimi;
  }

  @RequestMapping("/korrutus/{arv1}/{arv2}")
  String korrutamine(@PathVariable String arv1, @PathVariable String arv2){
    if(arv1==null) {return "esimene arv puudub";}
    int vastus=Integer.parseInt(arv1)*Integer.parseInt(arv2);
    return String.valueOf(vastus);
  }
  // /korrutus?arv1=3&arv2=2
  // /korrutus/3/2
  double pindala = 0;

  @RequestMapping("/pindala/{arv1}/{arv2}/{arv3}")
  String pindala(@PathVariable String arv1, @PathVariable String arv2, @PathVariable String arv3){
    if(arv1==null) {return "esimene arv puudub";}
    pindala=Integer.parseInt(arv1)*Integer.parseInt(arv2)*Integer.parseInt(arv3)/2;
    return String.valueOf(pindala);
  }

  @RequestMapping("/ruumala/{arv4}")
  String ruumala(@PathVariable String arv4){
    if(arv4==null) {return "esimene arv puudub";}
    double ruumala=Integer.parseInt(arv4)*pindala/3;
    return String.valueOf(ruumala);
  }

  public static void main(String[] args) {
      //System.getProperties().put("server.port", 40305);
      SpringApplication.run(Rakendus.class, args);
  }
}
