package com.its.angularjs.contact.dao.impl;

import org.springframework.stereotype.Repository;

import com.its.angularjs.contact.dao.interfaces.ContactDAO;
import com.its.angularjs.contact.entity.Contact;

@Repository
public class ContactImplDAO extends GenericHibernateDAO<Contact> implements ContactDAO {

	public ContactImplDAO() {
		super(Contact.class);
	}

}