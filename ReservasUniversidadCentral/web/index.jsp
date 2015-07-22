
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
                      <h2>Seleccione una de las opciones:</h2>   
                      
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
                         
                     
                                              
                      
                    
                    
                      <table class="table">
                        <thead>
                          <tr>
                            <th><h3 class="center-block"><a href="CrearUsuario.jsp">Registro de Usuarios</a></h3></th>
                            <th><h3 class="center-block"><a href="login.jsp">Ingreso de Usuarios</a></h3></th>
                             <% if(mensaje!=null){ %> <th><h3 class="center-block"><a href="CrearEspacio.jsp">Crear espacio</a></h3></th> <% } %>
                          </tr>
                        </thead>
                           <tbody>
                            <tr>
                                <td><a href="CrearUsuario.jsp"><img src="img/registro.png" alt="registro" class="center-block"/></a></td>
                                <td><a href="login.jsp"><img src="img/login.png" alt="login" class="center-block"/></a></td>
                                <%  if(mensaje!=null){ %> <td><a href="CrearEspacio.jsp"><img src="img/espacio.png" alt="login" class="center-block"/></a></td> <% } %>
                            </tr>
                          </tbody>
                       </table>
                    
                       
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
