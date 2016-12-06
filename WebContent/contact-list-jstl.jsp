<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact List</title>
</head>
<body>

<c:import url="header.jsp" />

<table>
	<tr>
      	<th>Name</th>
      	<th>E-mail</th>
      	<th>Address</th>
      	<th>Date of Birth</th>
      	<th>Action</th>
    </tr>
  <!-- runs through contacts inserting the table rows -->
  <c:forEach var="contact" items="${contacts}">
    <tr>
      <td>${contact.name}</td>
      <td><c:choose>
  			<c:when test="${not empty contact.email}">
    			<a href="mailto:${contact.email}">${contact.email}</a>
  			</c:when>
  			<c:otherwise>
    			Email not informed
  			</c:otherwise>
		</c:choose>
	  </td>
      <td>${contact.address}</td>
      <td><fmt:formatDate value="${contact.birthDate.time}"
    pattern="dd/MM/yyyy" /></td>
    <td>
      <a href="mvc?logic=ContactRemoveLogic&id=${contact.id}">Remove</a>
    </td>
    </tr>
  </c:forEach>
</table>
<c:import url="footer.jsp" />
</body>
</html>