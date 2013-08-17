package com.its.angularjs.contact.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.its.angularjs.contact.entity.Contact;
import com.its.angularjs.contact.service.interfaces.ContactService;

public class DataSetup {

	@Autowired
	private ContactService contactService;

	public void setup() {

		Contact contact = new Contact();
		
		contact.setName("Thiago");
		contact.setPhone("015-11111111");
		
		contactService.save(contact);

		contact = new Contact();
		
		contact.setName("Camilo");
		contact.setPhone("015-11111111");
		
		contactService.save(contact);

	}

}