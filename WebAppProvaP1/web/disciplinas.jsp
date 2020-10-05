<%-- 
    Document   : disciplinas
    Created on : 5 de out de 2020, 11:49:59
    Author     : Dario
--%>

<%@page import="br.com.fatecpg.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P1-POO<</title>
    </head>
    <body>
        <%@include file = "WEB-INF/jspf/menu.jspf"%>
       
        <%if (request.getParameter("salvar")!= null){
            int nota = Integer.parseInt(request.getParameter("nota"));
            int cod = Integer.parseInt(request.getParameter("cod"));
            Disciplina mudarNota = Disciplina.getList().get(cod);
            mudarNota.setNota(nota);
            
        }%>
       
        <h2>Disciplinas</h2>
               
               
        <table> 
               <Tr>
                   <th>Disciplina</th>
                   <th>Ementa</th>
                   <th>Ciclo</th>
                   <th>Nota</th>
                      
                 </tr>  
                           
                  <%for( int i = 0 ; i < Disciplina.getList().size() ; i++) {
                      Disciplina disciplina = Disciplina.getList().get(i);%>
                    <tr> 
                        <td><%= disciplina.getNome()%></td>  
                        <td><%= disciplina.getEmenta() %></td>
                        <td><%= disciplina.getCiclo() %></td>
                        <td><%= disciplina.getNota() %></td>
                     <td>
                         <form method ="get">
                            <input type "number" Name="nota" Value="<%= disciplina.getNota()%>"/>
                            <input type="submit" name="salvar" value="salvar"/>
                            <input type ="hidden" name="cod" value="<%= i %>"/>
                            
                             
                             
                         </form>
                     </td>      
                    </tr>     
                  <%}%>        
                           
        </table>
    </body>
</html>
