package com.its.angularjs.contact.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.its.angularjs.contact.dao.interfaces.ContactDAO;
import com.its.angularjs.contact.entity.Contact;
import com.its.angularjs.contact.service.interfaces.ContactService;

@Service
public class ContactImplService extends GenericImplService<Contact, ContactDAO> implements ContactService {

	@Autowired
	public ContactImplService(ContactDAO dao) {
		setDao(dao);
	}

}