package net.mbtc.mbtcapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MbtcApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbtcApiApplication.class, args);
		System.out.println(123);
	}

}
