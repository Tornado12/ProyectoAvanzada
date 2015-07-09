/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BD.UsuarioBD;
import Model.Usuario;
import Model.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ryu
 */
public class ServletUsuario extends HttpServlet {

       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Usuarios usuarios = (Usuarios)session.getAttribute("usuarios");
        if(usuarios==null){
            usuarios = new Usuarios();
            usuarios.setListaUsuarios(UsuarioBD.mgr.getUsuarios());
            session.setAttribute("usuarios", usuarios);
        }   
            
    Usuario est = new Usuario();
        est.setCodigo(request.getParameter("codigo"));
        est.setNombre(request.getParameter("nombre"));
        est.setGenero(request.getParameter("genero"));
        est.setOcupacion(request.getParameter("ocupacion"));
        est.setUsuario(request.getParameter("usuario"));
        est.setPassword(request.getParameter("password"));
        UsuarioBD.mgr.save(est,Boolean.TRUE);
        session.setAttribute("usuario", est);
        request.getRequestDispatcher("Mensaje.jsp").forward(request, response);        
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
}