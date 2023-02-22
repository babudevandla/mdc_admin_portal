package com.admin.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class )
public class AdminPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminPortalApplication.class, args);
	}

}
