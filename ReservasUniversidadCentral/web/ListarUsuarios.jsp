<%-- 
    Document   : ListarUsuarios
    Created on : 02-jul-2015, 18:22:59
    Author     : ryu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista Usuarios</h1>
        <table>
            <tr>
                <th>Item</th>
                <th>C&oacute;digo</th>
                <th>Nombre</th>
                <th>G&eacute;nero</th>
                <th>Ocupacion</th>
                <th>Usuario</th>
                <c:forEach varStatus="status" var="usuario" items="${usuario.listaUsuario}">
                <tr>
                    <td>${status.count}</td>
                    <td>${usuario.codigo}</td>
                    <td>${usuario.nombre}</td>
                    <td>${usuario.genero}</td>
                    <td>${usuario.ocupacion}</td>
                    <td>${usuario.usuario}</td>
                </tr>
                </c:forEach>
            </tr>
        </table>
        
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar</a>
    </body>
</html>
