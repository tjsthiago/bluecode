package com.bluecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BlueCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueCodeApplication.class, args);
	}

}
