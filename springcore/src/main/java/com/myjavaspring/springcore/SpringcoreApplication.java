package com.myjavaspring.springcore;

import com.myjavaspring.springcore.utils2.MySystem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		ApplicationContext context1 = SpringApplication.run(SpringcoreApplication.class, args);
		MySystem mySystem = context1.getBean(MySystem.class);
		mySystem.runJob();
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args)
	{
		return runner -> {
			System.out.println("Hello World");
		};
	}

}
