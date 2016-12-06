package br.com.nab.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.nab.jdbc.dao.ContactDao;
import br.com.nab.jdbc.model.Contact;

@WebServlet(name="addContact",urlPatterns={"/addContact"})
    public class AddContactServlet extends HttpServlet {		
        protected void service(HttpServletRequest request,
                            HttpServletResponse response)
                            throws IOException, ServletException {
            // gets the writer
            PrintWriter out = response.getWriter();
                            
            // getting the request parameters
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String dateString = request
                    .getParameter("birthDate");
            Calendar birthDate = null;
            
            // date conversion
            try {
                Date date = 
                        new SimpleDateFormat("dd/MM/yyyy")
                        .parse(dateString);
                birthDate = Calendar.getInstance();
                birthDate.setTime(date);
            } catch (ParseException e) {
                out.println("Date conversion error.");
                return; //stops method execution
            }
            
            // build a contact object
            Contact contact = new Contact();
            contact.setName(name);
            contact.setAddress(address);
            contact.setEmail(email);
            contact.setBirthDate(birthDate);
            
            // save the contact
            ContactDao dao = new ContactDao();
            dao.add(contact);
            
            // print the name of the contact that was added
            RequestDispatcher rd = request
                    .getRequestDispatcher("/contact-added.jsp");
            rd.forward(request,response);
        }
}