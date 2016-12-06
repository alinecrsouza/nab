package br.com.nab.mvc.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.nab.jdbc.dao.ContactDao;
import br.com.nab.jdbc.model.Contact;

public class ContactRemoveLogic implements Logic{
	public String runs(HttpServletRequest req, HttpServletResponse res)
		      throws Exception {

		    long id = Long.parseLong(req.getParameter("id"));

		    Contact contact = new Contact();
		    contact.setId(id);

		    ContactDao dao = new ContactDao();
		    dao.remove(contact);

		    System.out.println("Removing contact... ");

		    return "mvc?logic=ContactListLogic";
	}

}
