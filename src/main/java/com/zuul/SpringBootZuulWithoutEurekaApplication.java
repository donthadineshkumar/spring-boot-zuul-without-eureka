package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulWithoutEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulWithoutEurekaApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter(){
		return new SimpleFilter();
	}


}
