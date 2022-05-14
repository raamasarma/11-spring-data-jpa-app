package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.UserEntity;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		  UserRepository repository = context.getBean(UserRepository.class);
		  Iterable<UserEntity> findAll = repository.findAll();
		  findAll.forEach(limit->System.out.println(limit));
         context.close();
         	
         
         
	}

}
