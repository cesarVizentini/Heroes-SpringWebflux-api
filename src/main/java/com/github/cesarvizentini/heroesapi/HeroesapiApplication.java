package com.github.cesarvizentini.heroesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeroesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesapiApplication.class, args);
	}

//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(HeroesapiApplication.class, args);
//		GreetingClient greetingClient = context.getBean(GreetingClient.class);
//		// We need to block for the content here or the JVM might exit before the message is logged
//		System.out.println(">> message = " + greetingClient.getMessage().block());
//	}

}
