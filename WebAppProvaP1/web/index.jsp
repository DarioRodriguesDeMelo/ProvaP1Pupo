<%-- 
    Document   : inicio
    Created on : 5 de out de 2020, 11:49:38
    Author     : Dario
--%>
<%@page import="Listener.DBListener"%>
<%@page import="ads.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P1-POO<</title>
    </head>
    <body>
        <%@include file = "WEB-INF/jspf/menu.jspf"%>
        
        <% if ( DBListener.exception != null){%>
        <div style = "color : red"> <%= DBListener.exception.getMessage()%>  </div>
        
        <%}%>
        <hr/>
        <h3>Dario Rodrigues</h3>
        <h3>RA: 1290481923022</h3>
        <h3>Discplinas matriculadas: <%= Disciplina.getList().size()%></h3>
                
                
    </body>
</html>
