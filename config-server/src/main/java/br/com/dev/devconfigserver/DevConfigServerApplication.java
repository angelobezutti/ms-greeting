package br.com.dev.devconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DevConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevConfigServerApplication.class, args);
	}

}
