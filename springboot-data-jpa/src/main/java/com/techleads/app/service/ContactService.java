package com.techleads.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techleads.app.model.Contact;
import com.techleads.app.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
	
	
	public Contact save(Contact contact) {
		System.out.println(contactRepository.getClass().getName());
		contact=contactRepository.save(contact);
		
		return contact;
	}
	
	public Contact findById(Long id) {
		 Optional<Contact> optional = contactRepository.findById(id); 
		 if(optional.isEmpty()){
			 return new Contact();
		 }
		 return optional.get(); 
		/* Contact contact = contactRepository.findById(id).get(); */
		
	}

}
