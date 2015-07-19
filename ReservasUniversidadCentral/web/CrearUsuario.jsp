
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
      <script type="text/javascript" src="js/Validaciones.js"></script>

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
                      
                    <form name="formulario1" class="formularioTipo1" role="form" action="ServletUsuario" onsubmit="return validarForma(this)">
                         <div class="form-group">
                             <label for="cedula">Numero Cedula</label>
                             <input name="codigo" type="text"  class="form-control" id="cedula" placeholder="Ingrese número de cedula">
                         </div>    
            
                         <div class="form-group">
                              <label for="nombre">Nombre</label>
                              <input name="nombre" type="text" class="form-control" id="nombre" placeholder="Ingrese su nombre">
                         </div>    
                        
                         <div class="form-group">
                             <label for="genero">Genero</label>
                             <label class="radio-inline"><input type="radio" name="optradio" value="H">Hombre</label>
                             <label class="radio-inline"><input type="radio" name="optradio" value="M">Mujer</label>
                         </div>                              

                
                         <div class="form-group">
                             <label for="ocupacion">Ocupacion</label>
                                <select name="Ocupacion" id="ocupacion" class="default form-control">
                                    <option value="">Seleccionar</option>
                                    <option value="1">Estudiante</option>
                                    <option value="2">Egresado</option>
                                    <option value="3">Docente</option>
                                    <option value="4">Empleado</option>
                                    <option value="5">Administrativo</option>         
                                </select>
                         </div>
           
                        
                         <div class="form-group">
                             <label for="usuario">Usuario:(*)</label>
                             <input class="default form-control" type="text" name="user" onfocus="this.select();" id="usuario" placeholder="Ingrese su username"/> 
                         </div>
                        
                         
                          <div class="form-group">
                            <label for="pass" class="oce-first"> Password:(*)</label>
                            <input class="form-control default" type="password" name="password" onfocus="this.select();" id="pass" placeholder="Ingrese su contraseña"/>
                          </div>  
               
       
                          <button type="reset" class="btn btn-default default btn-lg">Limpiar</button>
                          <button type="submit" class="btn btn-success defaul btn-lg">Enviar</button>
                          <button type="button" class="btn btn-info btn-lg right-block"><a href="index.jsp">Regresar</a></button> 
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
