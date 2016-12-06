package br.com.nab.mvc.logic;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.nab.jdbc.dao.ContactDao;
import br.com.nab.jdbc.model.Contact;

public class ContactListLogic implements Logic {

	public String runs(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		    
		List<Contact> contacts = new ContactDao().getList();
		    
		req.setAttribute("contacts", contacts);
		    
		return "contact-list-jstl.jsp";
	}
}
