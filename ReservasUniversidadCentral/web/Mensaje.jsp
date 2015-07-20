
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
       
       <% 
           String resul = (String)session.getAttribute("usuario");
       %>
       
   
       resultado es <%=resul+" "%>
       
     <table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr align="center" bgcolor="#66CC00">
        <td colspan="2"><h1><span class="Estilo1">RESERVAS UNIVERSIDAD CENTRAL</span></h1></td>
      </tr>
    <tr>
        <td colspan="2"><div align="center"><h4>EL USUARIO SE REGISTRO DE FORMA CORRECTA</h4></div></td>
    </tr>
        <tr align="center">
        <td colspan="2">&nbsp;</td>
        </tr>
        <tr align="center">
            <td colspan="2">
            <h4><a href="index.jsp">Volver al Inicio</a></h4></td>
    <tr>
    <td colspan="2" bgcolor="#66CC00"><div align="center"><strong><span class="Estilo2">2015</span></strong></div></td>
    </tr>
  </body>
</html>
