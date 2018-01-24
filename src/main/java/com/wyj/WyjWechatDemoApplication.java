package com.wyj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class WyjWechatDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WyjWechatDemoApplication.class, args);
	}
}
