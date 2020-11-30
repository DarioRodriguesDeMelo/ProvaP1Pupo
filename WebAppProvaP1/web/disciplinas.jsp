<%-- 
    Document   : disciplinas
    Created on : 10 de out de 2020, 14:30:10
    Author     : Dario
--%>

<%@page import="ads.Disciplina"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArrayList<Disciplina> list = (ArrayList<Disciplina>)application.getAttribute("list");
    if(list==null){
        list = Disciplina.getList();
        application.setAttribute("list", list);
    }
    
    Exception requestException = null;
    if(request.getParameter("update")!=null){
        try{
            int i = Integer.parseInt(request.getParameter("i"));
            double nota = Double.parseDouble(request.getParameter("nota"));
            list.get(i).setNota(nota);
            response.sendRedirect(request.getRequestURI());
        }catch(Exception ex){
            requestException = ex;
        }
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplinas - P1</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <h1>Disciplinas</h1>
        <%if(requestException!=null){%>
        <div style="color: red">Erro ao alterar nota: <%= requestException.getMessage()  %></div>
        <%}%>
        <table border="1">
            <tr>
                <th>Índice</th>
                <th>Nome</th>
                <th>Nota</th>
                <th>Alterar nota</th>
            </tr>
            <%for(int i=0; i<list.size(); i++){%>
            <tr>
                <td><%= i %></td>
                <td><%= list.get(i).getNome() %></td>
                <td><%= list.get(i).getNota() %></td>
                <td>
                    <form>
                        <input type="hidden" name="i" value="<%= i %>"/>
                        <input type="number" min="0" max="10" maxlentgh ="2" size ="2" name="nota"/>
                        <input type="submit" name="update" value="Alterar nota"/>
                    </form>
                </td>
            </tr>
            <%}%>
        </table>
    </body>
</html>