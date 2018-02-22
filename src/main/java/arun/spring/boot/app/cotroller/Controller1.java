package arun.spring.boot.app.cotroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import arun.spring.boot.app.Counter;
import arun.spring.boot.app.Response;
import io.swagger.annotations.ApiOperation;

@RestController
public class Controller1 {
	
	@Autowired
	protected JdbcTemplate jdbcTemplate;
    
	Map map = new HashMap();
	
    @GetMapping("/hello")
    @ApiOperation("hello test - Get method")
    public Counter home() {
    	int count = jdbcTemplate.queryForObject("select count(*) from makelifeeasy.user", Integer.class);
    	Counter counter = new Counter();
    	counter.setCount(count);
    	counter.setType("UserCount");
    	//return "{count:"+count+"}";
    	for(int i=0; i<100000;i++) {
    		
    		for (int j=0; j<100; j++) {
    			map.put(j, "/hello/"+j);
    		}
    	}
    	return counter;
    }

    @PostMapping(value="/api/hello", consumes={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation("hello test - Get method")
    public Response home(@RequestBody Counter cntr) {
    	int count = jdbcTemplate.queryForObject("select count(*) from makelifeeasy.user", Integer.class);
    	Response resp = new Response();
    	resp.setRespCount(5*count);
    	String[] respType = {"Response1: "+cntr.getType(), "Response2: "+cntr.getType(), "Response3: "+cntr.getType()};
    	resp.setRespType(respType);
    	//return "{count:"+count+"}";
    	for(int i=0; i<100000;i++) {
    		//Map map = new HashMap();
    		for (int j=0; j<100; j++) {
    			map.put(j, "/api/hello/"+j);
    		}
    	}
    	return resp;
    }
    
    @GetMapping(value="/helloxml", produces=MediaType.APPLICATION_XML_VALUE)
    public Counter homexml() {
    	int count = jdbcTemplate.queryForObject("select count(*) from makelifeeasy.user", Integer.class);
    	Counter counter = new Counter();
    	counter.setCount(count);
    	counter.setType("UserCount");
    	//return "{count:"+count+"}";
    	return counter;
    }

    @GetMapping(value="/homejson", produces=MediaType.APPLICATION_JSON_VALUE)
    public Counter homejson() {
    	int count = jdbcTemplate.queryForObject("select count(*) from makelifeeasy.user", Integer.class);
    	Counter counter = new Counter();
    	counter.setCount(count);
    	counter.setType("UserCount");
    	//return "{count:"+count+"}";
    	return counter;
    }
}
