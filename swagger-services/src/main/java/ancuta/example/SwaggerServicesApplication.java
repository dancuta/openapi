package ancuta.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ancuta.example"})
@EnableAutoConfiguration
public class SwaggerServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerServicesApplication.class, args);
	}

}
