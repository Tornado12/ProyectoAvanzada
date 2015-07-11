/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* ARCHIVO VALIDACIONES.JS*/

function validarForma(forma){
    
        // validamos el codigo 
        
        var codigo = forma.codigo;
        if(codigo.value == ""){
            alert("Debe proporcionar un numero de Cedula");
            codigo.focus();
            codigo.select();
            return false;
        }
    
        // validamos el nombre del estudiante
        var nombre = forma.nombre;
        if(nombre.value == ""){
            alert("Debe proporcionar un nombre de Usuario");
            nombre.focus();
            nombre.select();
            return false;
        }
        
        //Validamos el Genero
	var generos = forma.genero;
	var radioSeleccionado = false;
	
	//revisamos si se selecciono algun radiobutton
	for(i=0; i < generos.length;i++){
		if(generos[i].checked){
			radioSeleccionado = true;
		}
	}
	if(!radioSeleccionado){
		alert("Debe seleccionar el Genero");
		return false;
	}
        
        //Validamos la carrera
	var ocupacion = forma.carrera;
	if(ocupacion.value == ""){
		alert("Debe seleccionar una ocupacion");
		return false;
	}
	
	//Validamos el usuario
	var usuario = forma.usuario;
	if( usuario.value == "" || usuario.value == "Escribir usuario"){
		alert("Debe proporcionar un nombre de usuario");
		usuario.focus();
		usuario.select();
		return false;
	}
	
	//Validamos el password
	var password = forma.password;
	if(password.value == "" || password.value.length < 3){
		alert("Debe proporcionar un password al menos de 3 caracteres");
		password.focus();
		password.select();
		return false;
	}
	
	//Formulario validado
	alert("Formulario valido, enviando datos...");
	return true;
}




