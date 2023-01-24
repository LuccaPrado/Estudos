package br.com.luccaprado.Estudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EstudosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudosApplication.class, args);
	}

}
