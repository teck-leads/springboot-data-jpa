package com.techleads.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.techleads.app.model.Contact;
import com.techleads.app.service.ContactService;

@SpringBootApplication
public class SpringbootDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootDataJpaApplication.class, args);
		ContactService service = ctx.getBean(ContactService.class);
//TODO insert
//		Contact contact=new Contact();
//		contact.setId(1271265L);
//		contact.setName("madhav");
//		contact.setContact("8019772039");
//		contact=service.save(contact);
//		System.out.println(contact);
		
		//TODO findById
		
		 Contact contact = service.findById(12712653l);
		 System.out.println(contact);
		 System.exit(0);
		
	}

}
