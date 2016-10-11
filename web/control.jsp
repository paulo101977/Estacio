<%-- 
    Document   : index
    Created on : 05/10/2016, 09:24:23
    Author     : Jefferson Cruz
--%>


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
          
          <% if(request.getParameter("insert")!=null){ %>
                <%@include file='insert.html'%>
          <% } %>
          
          <% if(request.getParameter("update")!=null){ %>
                <%@include file='update.html'%>
          <% } %>
          
          <% if(request.getParameter("delete")!=null){ %>
                <%@include file='delete.html'%>
          <% } %>

    </body>

</html>