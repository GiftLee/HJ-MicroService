package com.hzcf.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.hzcf"})
public class ProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
            	System.out.println("执行关闭操作。");
            }
        }));
	}
}
