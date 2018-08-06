package com.msestudiante.msestudiante;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EntityScan(basePackages = "com.msestudiante.Entidades")
@ComponentScan(basePackages = {"com.msestudiante.Controladores"})
public class MsestudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsestudianteApplication.class, args);
	}
}
