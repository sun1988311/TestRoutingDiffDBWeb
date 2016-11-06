package com.web.diff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:ApplicationContext.xml")
public class TestRoutingDiffDbWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRoutingDiffDbWebApplication.class, args);
	}
}
