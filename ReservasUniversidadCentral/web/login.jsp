<%-- 
    Document   : login
    Created on : 27-jun-2015, 10:23:24
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
<table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr align="center" bgcolor="#FF0000">
    <td colspan="2"><h2><span class="Estilo1">Inicio de Sesion</span></h2></td>
  </tr>
  <tr>
    <td width="625">
    <form name="frmPrincipal" method="post" action="SVerificarUsuario">
    <table width="620" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="131">Usuario</td>
        <td width="489"><input type="text" name="txtUsuario" id="txtUsuario" /></td>
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
    
    </td>
  </tr>
  <tr>
    <td colspan="2" bgcolor="#FF0000"><div align="center"><strong><span class="Estilo2">2015</span></strong></div></td>
  </tr>
</table>
</body>
</html>



