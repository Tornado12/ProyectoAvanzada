<%-- 
    Document   : CrearUsuario
    Created on : 26-jun-2015, 21:58:24
    Author     : ryu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <script type="text/javascript" src="validaciones.js"></script>
    <style type="text/css">
<!--
body {
	background-color: #FFFF99;
}
body,td,th {
	font-family: Arial, Helvetica, sans-serif;
}
</style>
     </head>
     <table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr align="center" bgcolor="#66CC00">
        <td colspan="2"><h1><span class="Estilo1">RESERVAS UNIVERSIDAD CENTRAL</span></h1></td>
        </tr>
        <td colspan="2"><div align="center"><h3><span class="Estilo2">Formulario de Inscripcion</span></h3></div></td>
        </tr>
    <body>
        <br><br>
        <form name="formulario1" class="formularioTipo1" action="ServletUsuario" onsubmit="return validarForma(this)">
        <table>
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
                    <input class="default" type="text" name="user" value="Escribir Usuario" onfocus="this.select();"/> 
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
        <h4><div aling="center"><a href="index.jsp">Volver al inicio</a></h4></div></td>
  </tr>  
   <tr>
    <td colspan="2" bgcolor="#66CC00"><div align="center"><strong><span class="Estilo2">2015</span></strong></div></td>
  </tr>
    </body>
</html>
