package com.lamune.sb154.mvn_webinit.mvn_webinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvnWebinitApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvnWebinitApplication.class, args);

		System.err.println("테스트 호출 = " ); //:TODO(lamune): Debug

	}
}
