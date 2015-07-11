<%-- 
    Document   : login
    Created on : 27-jun-2015, 10:23:24
    Author     : ryu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
    <body>
<table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr align="center" bgcolor="#66CC00">
        <td colspan="2"><h1><span class="Estilo1">RESERVAS UNIVERSIDAD CENTRAL</span></h1></td>
      </tr>
      <tr>
    <td colspan="2"><h4>INICIO DE SESION</h4></td>
    </tr>
  <tr>
    <td width="625">
    <form name="frmPrincipal" method="post" action="SVerificarUsuario">
    <table width="620" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="131">Usuario</td>
        <td width="489"><input type="text" name="txtUser" id="txtUser" /></td>
      </tr>
      <tr>
        <td>Clave</td>
        <td><input type="password" name="txtClave" id="txtClave" /></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td><input type="submit" name="btnEntrar" id="btnEntrar" value="Entrar" /></td>
      </tr>
    </table>
    </form>
        <h4><div aling="center"><a href="index.jsp">Volver al inicio</a></h4></div></td>
 </tr>  
  <tr>
    <td colspan="2" bgcolor="#66CC00"><div align="center"><strong><span class="Estilo2">2015</span></strong></div></td>
  </tr>
</table>
</body>
</html>



