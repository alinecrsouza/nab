<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <body>
    <%-- coment�rio em JSP aqui: nossa primeira p�gina JSP --%>
    
    <%
      String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
    %>
    <% out.println(mensagem); %>

    <br />
    
    <%
      String desenvolvido = "Desenvolvido por (SEU NOME AQUI)";
    %>        
    <%= desenvolvido %>

    <br />
    
    <%
      System.out.println("Tudo foi executado!");
    %>
  </body>
</html>