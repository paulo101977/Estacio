<%-- 
    Document   : index
    Created on : 05/10/2016, 09:24:23
    Author     : Jefferson Cruz
--%>

<%@ page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>JSP Templates</title>
        <link rel="stylesheet" type="text/css" href="resource/bootstrap/dist/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="resource/bootstrap/dist/css/bootstrap-theme.min.css" />
        <link rel="stylesheet" type="text/css" href="resource/css/custom.css" />
        <script src="resource/jquery/dist/jquery.min.js"></script>
        <script src="resource/bootstrap/dist/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="custom-space"></div>
                <a href="/TrabalhoMVC" class="glyphicon glyphicon-chevron-left"><strong>Voltar</strong></a>
                <div class="custom-space"></div>
                <div class="custom-space"></div>
                <% if(request.getParameter("insert")!=null){ %>
                      <div class="container">
                        <div class="row">
                            <div class="col-md-4">
                                <form action="CandidatoFC">
                                    <%@include file='insert.html'%>
                                    <button type="submit" class="btn btn-primary">Enviar</button>
                                </form>
                            </div>
                        </div>
                      </div>
                <% } %>

                <% if(request.getParameter("update")!=null){ %>
                      <%@include file='update.html'%>
                <% } %>

                <% if(request.getParameter("delete")!=null){ %>
                      <%@include file='delete.html'%>
                <% } %>
                
               
            </div>
       </div>
    </body>

</html>