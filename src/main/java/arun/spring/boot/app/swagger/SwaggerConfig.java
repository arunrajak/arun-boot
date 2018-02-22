package arun.spring.boot.app.swagger;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import arun.spring.boot.app.cotroller.Controller1;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@ComponentScan(basePackageClasses = Controller1.class)
public class SwaggerConfig {
	
	@Bean
	public Docket postsApi() {
		/*return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();*/
		return new Docket(DocumentationType.SWAGGER_2).pathMapping("/")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return regex("^/.*");
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("My Rest API")
				.description("My Rest API details")
				.termsOfServiceUrl("http://www.test.com")
				.licenseUrl("test@gmail.com").version("1.0").build();
	}
	
}
