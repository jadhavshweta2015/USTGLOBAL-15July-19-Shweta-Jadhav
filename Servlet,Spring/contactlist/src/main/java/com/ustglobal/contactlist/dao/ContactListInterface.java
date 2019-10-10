package com.ustglobal.contactlist.dao;

import com.ustglobal.contactlist.dto.ContactList;

public interface ContactListInterface {
	public ContactList login(String name,String password);
	public boolean add(ContactList contact);
	public ContactList call(String name,String number);
}
