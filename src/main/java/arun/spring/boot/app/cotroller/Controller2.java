package arun.spring.boot.app.cotroller;

import java.io.IOException;
import java.util.Base64;
import java.util.Enumeration;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	static final String AUTHENTICATION_HEADER = "Authorization";
	
    @PostMapping(value="mypage/{page}")
    String myPage(HttpServletRequest  req, @PathVariable("page")String page) {
    	/*Enumeration<String> enumHeader = req.getHeaderNames();
    	
    	while(enumHeader.hasMoreElements()) {
    		String key = enumHeader.nextElement();
    		System.out.println(key+":"+req.getHeader(key));
    	}
    	String authCredentials = req.getHeader(AUTHENTICATION_HEADER);
    	
		final String encodedUserPassword = authCredentials.replaceFirst("Basic"
				+ " ", "");
		String usernameAndPassword = null;
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(encodedUserPassword);
			usernameAndPassword = new String(decodedBytes, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		final StringTokenizer tokenizer = new StringTokenizer(
				usernameAndPassword, ":");
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();
		System.out.println("username: "+username+", password: "+password);
    	
    	return "Hello from Spring Boot my Page: " +page+", username: "+username+", password: "+password;*/
    	return "Hello from Spring Boot my Page: " +page;
    }
}
