/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Model.Usuario;
import Servicios.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "VerificarUsuario", urlPatterns = {"/VerificarUsuario"})
public class VerificarUsuario extends HttpServlet {
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         Usuario est = new Usuario();
         UsuarioDAO  user = new UsuarioDAO();
         boolean ingreso;
   
       try (PrintWriter out = response.getWriter()) { 
         String usuario = request.getParameter("usuario");
       //  String clave = request.getParameter("clave");
       
       
        ingreso = user.Validar(request.getParameter("usuario"),request.getParameter("clave"));
         
        HttpSession session = request.getSession(false); 
      
        
        if(ingreso == true){
              //El usuario existe en la base de datos y clave correcta
              //Creamos la sesion
              
            
             // sesion.setAttribute("usuario", "Bienvendo 
              session.setAttribute("name", usuario); 
             
              request.getSession().setAttribute("usuario", "Bienvenido: "); 
              response.sendRedirect("CrearReserva.jsp");
        }else{
            
            request.getSession().setAttribute("result", "El usuario o contraseña incorrectos!!!");    
            response.sendRedirect("Mensaje.jsp");
            
        }
      
        
      }
        
     /**   
       String user=request.getParameter("txtUsuario");
        String clave=request.getParameter("txtClave");
        Usuario u=new Usuario();
       // u=u.verificarUsuario(user, clave);
        if(u!=null){
            //El usuario existe en la base de datos y clave correcta
            //Creamos la sesion
            HttpSession sesion=request.getSession(true);
            sesion.setAttribute("usuario", u);
        //    if(u.getUsuario_privilegio()==0){
        //     response.sendRedirect("CrearReserva.jsp");
        //   }
        }else{
            //El usuario no existe o clave incorrecta
            response.sendRedirect("Error.jsp");
        }
      **/  
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
