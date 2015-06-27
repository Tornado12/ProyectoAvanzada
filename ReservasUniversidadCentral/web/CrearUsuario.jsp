<%-- 
    Document   : CrearUsuario
    Created on : 26-jun-2015, 21:58:24
    Author     : ryu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilos.css">
        <script type="text/javascript" src="validaciones.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario de Inscripcion</h1>
        <br><br>
        <form name="formulario1" class="formularioTipo1" action="ServletUsuarioCtr" onsubmit="return validarForma(this)">
        <table>
            <caption><h2>INSCRIPCION</h2></caption>
            <tr>
               <td>Numero Cedula</td>
               <td><input name="codigo" type="text"></td>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><input name="nombre" type="text"></td>
            </tr>
            <tr>
                <td>Genero</td>
                <td>Hombre<input type="radio" name="genero" value="M"> Mujer<input type="radio" name="genero" value="F">
                </td>
                
            </tr>
            <tr>
                <td>Ocupacio</td>
                <td>
                    <select name="Ocupacion" class="default">
                        <option value="">Seleccionar</option>
                        <option value="1">Estudiante</option>
                        <option value="2">Egresado</option>
                        <option value="3">Docente</option>
                        <option value="4">Empleado</option>
                        <option value="5">Administrativo</option>
                       
                    </select>
                </td>
            </tr>
            <tr>
                <td class="oce-first">
                    Usuario:(*)
                </td>
                <td>
                    <input class="default" type="text" name="usuario" value="Escribir Usuario" onfocus="this.select();"/> 
                </td>
            </tr>
            <tr>
                <td class="oce-first">
                    Password:(*)
                </td>
                <td>
                    <input class="default" type="password" name="password" onfocus="this.select();"/>
                </td>  
            </tr>
            <tr style ="text-align: center;">
                <td>
                    <input  type="reset" value="Limpiar" class="default"/>
                </td>
                <td>
                    <input type="submit" value="Enviar" class="defaul">
                </td>
            </tr>
        </table>   
    </form> 
        <td>
      <a href="${pageContext.request.contextPath}/index.jsp">Volver al inicio</a>
      <a href="${pageContext.request.contextPath}/Login.jsp">Ingreso de Usuario</a>
    </td>
    </body>
</html>
