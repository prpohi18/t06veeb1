package springalgus;
import java.lang.Math;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IndexController implements ErrorController{

  private static final String PATH = "/error";

  @RequestMapping(value = PATH)
  public String error() {
      return "Error handling";
  }

  @Override
  public String getErrorPath() {
      return PATH;
  }
}
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/surface")
    String surface(double value1, double value2, double value3) {
		if(value1 + value2 > value3 & value1 + value3 > value2 & value2 + value3 > value1){
			double p = (value1 + value2 + value3)/2;
			double area = Math.sqrt(p*(p-value1)*(p-value2)*(p-value3));
			String surface = String.valueOf(area);
			return "Kolmnurga pindala on "+ surface;
		}else{
			return  "Ei ole kolmnurk!";
    }
    }
   
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
