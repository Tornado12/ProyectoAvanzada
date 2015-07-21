
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
  
      <script src="js/jquery.min.js" type="text/javascript"></script>
      <script src="js/bootstrap.min.js" type="text/javascript"></script>
      <title>Sistema de reservas UCENTRAL</title>
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
                          String msg = (String)session.getAttribute("result"); 
                        %>        
                         
                       <div class="alert alert-success">
                          <%=msg+""%>                      
                       </div>
                       
                       <br>
                       <br/>
                       
                       <div class="center-block">
                            <a href="index.jsp" class="btn btn-info btn-lg" role="button">Regresar</a>
                       </div>
                        
                       
                       
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
