<%-- 
    Document   : CrearReserva
    Created on : 12-jul-2015, 20:44:57
    Author     : ryu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <script type="text/javascript" src="Validaciones.js"></script>
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
        <form name="formulario2" class="formularioTipo1" action="ServletReserva" onsubmit="return validarForma(this)">
        <table>
            <tr>
                <td>Tipo Reserva</td>
                <td>
                    <select name="Treserva" class="default">
                        <option value="">Seleccionar</option>
                        <option value="1">Academica</option>
                        <option value="2">Administrativa</option>
                        <option value="3">Capacitacion</option>
                        <option value="4">Otros</option>
                    </select>
                </td>        
            <tr>
                <td>Fecha</td>
                <td><input name="fecha" type="text"></td>
            </tr>
            <tr>
                <td>Hora Inicio</td>
                <td><input name="Hinicio" type="text"></td>
            </tr>
            <tr>
                <td>Hora Final</td>
                <td><input name="Hfinal" type="text"></td>
            </tr>
            <tr>
                <td>Tipo Espacio</td>
                <td>
                    <select name="Espacio" class="default">
                        <option value="">Seleccionar</option>
                        <option value="1">Salon</option>
                        <option value="2">Auditorio</option>
                        <option value="3">Laboratorio</option>
                        <option value="4">Teatro</option>
                    </select>
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
