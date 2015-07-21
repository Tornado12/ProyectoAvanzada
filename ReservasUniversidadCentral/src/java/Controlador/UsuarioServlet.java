
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


@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        Usuario est = new Usuario();
        UsuarioDAO crear = new UsuarioDAO();
        boolean test;
                    
        try (PrintWriter out = response.getWriter()) {
            
            /* TODO output your page here. You may use following sample code. */
            
            
             est.setCedula(request.getParameter("codigo"));
             est.setNombre(request.getParameter("nombre"));
             est.setApellido(request.getParameter("apellido"));
             est.setGenero(request.getParameter("genero"));
             est.setCargo(request.getParameter("cargo"));
             est.setUsername(request.getParameter("username"));
             est.setPassword(request.getParameter("password"));
             est.setRol(request.getParameter("rol"));
            
            
             
               //test = est.GuardarUsuario(est);
               test = crear.GuardarUsuario(est);
               
                if (test==true) {
                   // request.getSession().setAttribute("valor", test);
                    request.getSession().setAttribute("result", "Usuario registrado exitosamente");
                    response.sendRedirect("Mensaje.jsp");
                   // request.getRequestDispatcher("Mensaje.jsp").forward(request, response); 
                } else {
                   // request.getSession().setAttribute("valor", test);
                    request.getSession().setAttribute("result", "Error al registrar usuario");
                   // request.getRequestDispatcher("Mensaje.jsp").forward(request, response); 
                    response.sendRedirect("Mensaje.jsp");
                    //out.println("Error al registrar usuario");
                    //out.println("VALOR REGRESO "+test);
                }
                
               
               
                //est.GuardarUsuario(est);
                //Usuario.mgr.save(est,Boolean.TRUE);
                // Usuario.mgr.GuardarUsuario(est, Boolean.TRUE);
                // session.setAttribute("usuario", est);
                // session.setAttribute("regreso", aa);
                //request.getSession().setAttribute("regreso", aa);
               
            
            
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
