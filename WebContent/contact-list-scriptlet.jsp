<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*,
        br.com.nab.jdbc.dao.*,
        br.com.nab.jdbc.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <body>
    <table>
    	<tr>
      		<th>Name</th>
      		<th>E-mail</th>
      		<th>Address</th>
      		<th>Date of Birth</th>
      	</tr>
      <%
      ContactDao dao = new ContactDao();
      List<Contact> contacts = dao.getList();      
      for (Contact contact : contacts ) {
      %>      	
        <tr>
          <td><%=contact.getName() %></td> 
          <td><%=contact.getEmail() %></td>
          <td><%=contact.getAddress() %></td>
          <td><%=contact.getBirthDate().getTime() %></td>
        </tr>
      <%
      }
      %>
    </table>
  </body>
</html>