<%-- 
    Document   : index
    Created on : 05/10/2016, 09:24:23
    Author     : Jefferson Cruz
--%>

<%@page import="Modelo.Candidato"%>
<%@page import="Control.ControleCandidato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="resource/bootstrap/dist/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="resource/bootstrap/dist/css/bootstrap-theme.min.css" />
        <link rel="stylesheet" type="text/css" href="resource/css/custom.css" />
        <script src="resource/jquery/dist/jquery.min.js"></script>
        <script src="resource/bootstrap/dist/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <form action="control.jsp">
                        <div class="custom-space"></div>
                        <button type="submit" name="insert" value="insert" 
                                class="btn btn-primary">Inscrição</button>
                        <button type="submit" name="update" value="update" 
                                class="btn btn-primary">Atualizar</button>
                        <button type="submit" name="delete" value="update" 
                                class="btn btn-primary">Desistir</button>
                                
                        <div class="custom-space"></div>
                        
                        <table class="table table-striped">
                            <tr>
                              <th>CPF</th>
                              <th>Nome</th> 
                              <th>Vaga</th>
                            </tr>

                            <% ControleCandidato ctrl = new ControleCandidato();
                                for(Candidato c : ctrl.getAll()) {%>
                                    <tr>
                                        <td><%=c.cpf%></td>
                                        <td><%=c.nome%></td> 
                                        <td><%=c.vaga%></td>
                                    </tr>

                            <% } %>

                        </table>
                    </form>
                </div>
            </div>
        </div>
        
    </body>
    
</html>
