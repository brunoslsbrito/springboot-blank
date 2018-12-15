package br.com.aisdigital.wiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class WiserApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiserApplication.class, args);
	}
}
