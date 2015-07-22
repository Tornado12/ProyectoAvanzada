<%-- 
    Document   : CrearReserva
    Created on : 12-jul-2015, 20:44:57
    Author     : ryu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    
      <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
      <link rel="stylesheet" type="text/css" href="css/estilo-general.css">
      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
      <title>Sistema de reservas UCENTRAL</title>
      <script src="js/jquery.min.js" type="text/javascript"></script>
      <script src="js/bootstrap.min.js" type="text/javascript"></script>
         
    </head>
   
    <body>
   
         <div class="container">
           
             <header>
                <div class="panel panel-default">
                <div class="panel-body">
                 <div class="row">
                 <div class="col-lg-6 logo">
                     <img src="img/logo_ucentral.png" class="img-responsive center-block"/>             
                 </div>
              
                 <div class="col-lg-6">
                     <h1 class="text-center">RESERVAS UNIVERSIDAD CENTRAL</h1>
       
                    <p class="text-center lead">Bienvenidos al sistema de reservas de zonas comunes de la Universidad Central</p>
                 
                 </div>
                 </div>
                </div></div>
             </header>  
            
             
             
             
             <div class="bloque_principal">    
                 
                <div class="panel panel-default">
                    <div class="panel-body">
        

                        <%  
                           String mensaje = (String)session.getAttribute("usuario"); 
                           String name = (String)session.getAttribute("name");

                            if(mensaje!=null){

                        %>        
                          <div class="alert alert-info">   
                           <%=mensaje+ name+""%> 


                           <a href="logout" class="text-right"> Cerrar Sesión </a>

                          </div>

                        <%       
                            } 
                        %>       
                        
                        
                        
        
        
                        <form method="post" name="formulario1" class="formularioTipo1" role="form" action="ServletReserva" onsubmit="return validarForma(this)">
                        
                                
                                   <div class="form-group">
                                    <label for="fecha">Fecha</label>
                                    <input name="fecha" type="text" id="fecha" class="form-control" />
                                   </div>  
                          
                                   <div class="form-group">
                                   <label for="hora">Hora Inicio</label>
                                   <input name="hora_ini" id="hora" type="text" class="form-control">
                                   </div>
                            
                                   <div class="form-group">
                                   <label>Hora Final</label>
                                   <input name="hora_fin" id="hora_fin" type="text" class="form-control">
                                   </div>
                           
                          
                                   <div class="form-group">
                                    <label>Tipo Espacio</label>
                               
                                    <select name="espacio" id="espacio" class="default form-control">
                                        <option value="">Seleccionar</option>
                                        <option value="salon">Salon</option>
                                        <option value="auditoria">Auditorio</option>
                                        <option value="laboratorio">Laboratorio</option>
                                        <option value="teatro">Teatro</option>
                                    </select>
                                   </div> 
                               
                                     
                                   <div class="form-group">
                                        <button type="submit" class="btn btn-success defaul btn-lg">Enviar</button>
                                   </div> 
                                   

                           
                                    <button type="reset" class="btn btn-default default btn-lg">Limpiar</button>
                                    
                                    
                         
                                    <a href="index.jsp" class="btn btn-info btn-lg" role="button">Regresar</a>
                                   
                        </form>     
      
                        
                    </div>
                 </div>
              
             </div>
     
         </div>
        

          <footer class="row-fluid text-right">
              <span class="col-lg-12 lead"><strong>Sistema desarrollodo por: </strong></span>
                 <p class="col-lg-12 small"> Nestor Castro - Javier Becerra </p>
                 <ul class="list-inline col-lg-12">
                     <li>Programación Avanzada</li>
                     <li>Universidad Central 2015</li>
                 </ul>
                <br>
                <div class="clearfix"></div>
          </footer>
                  
    </body>
</html>
