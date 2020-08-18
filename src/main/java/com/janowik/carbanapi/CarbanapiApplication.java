package com.janowik.carbanapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class CarbanapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarbanapiApplication.class, args);
	}

}
