
package Controlador;

//import BD.UsuarioBD;
import Model.Usuario;
import Model.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletUsuario extends HttpServlet {

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
        HttpSession session = request.getSession();
       
        
        RequestDispatcher rd = request.getRequestDispatcher("Mensaje.jsp");
        rd.forward(request, response);
       
       /**
        Usuario usuarios = (Usuario)session.getAttribute("usuarios");
       
        if(usuarios==null){
            usuarios = new Usuario();
            usuarios.setListaUsuarios(Usuario.mgr.);
            session.setAttribute("usuarios", usuarios);
        } 
        **/
        
       /**
        Usuario est = new Usuario();
        est.setCedula(request.getParameter("codigo"));
        est.setNombre(request.getParameter("nombre"));
        est.setApellido(request.getParameter("apellido"));
        est.setGenero(request.getParameter("genero"));
        est.setCargo(request.getParameter("cargo"));
        est.setUsername(request.getParameter("username"));
        est.setPassword(request.getParameter("password"));
        est.setCargo(request.getParameter("cargo"));
        
        
        Usuario.mgr.GuardarUsuario(est,Boolean.TRUE);
       // session.setAttribute("usuario", est);
        request.getRequestDispatcher("Mensaje.jsp").forward(request, response);        
       **/ 
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