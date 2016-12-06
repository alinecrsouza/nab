<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="nab" %>
<!DOCTYPE html>
<html>
  <head>
    <link href="css/jquery-ui.css" rel="stylesheet">
    <script src="js/jquery.js"></script>
    <script src="js/jquery-ui.js"></script>
  </head>
  <body>
  <c:import url="header.jsp" />
    <h1>Add Contacts</h1>
    <hr />
    <form action="addContact">
      Name: <input type="text" name="name" /><br />
      E-mail: <input type="text" name="email" /><br />
      Address: <input type="text" name="address" /><br />
      Date of Birth: 
        <nab:dateField id="birthDate" /><br />
      
      <input type="submit" value="Save" />
    </form>
    <c:import url="footer.jsp" />
  </body>
</html>