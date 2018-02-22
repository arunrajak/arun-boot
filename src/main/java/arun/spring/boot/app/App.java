package arun.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
//@Configuration
//@ComponentScan
//@RestController
//@EnableAutoConfiguration
public class App 
{
	
	
	/*@RequestMapping("/")
    String home() {
        return "Hello World!";
    }*/

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

	
    /*public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Object[] controllers = new Object[2];
    	controllers[0] = arun.spring.boot.app.cotroller.Controller1.class;
    	controllers[1] = arun.spring.boot.app.cotroller.Controller2.class;
    	
    	SpringApplication.run(controllers, args);
    }*/

    

}
