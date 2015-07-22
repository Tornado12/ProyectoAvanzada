
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.ITipoEspacio;
import Model.FactoryTipoEspacio;
import Model.Salon;
import Model.Auditorio;
import Model.Laboratorio;
import Model.Teatro;
import Servicios.EspaciosDAO;
/**
 *
 * @author Javier
 */
@WebServlet(name = "ServletEspacio", urlPatterns = {"/ServletEspacio"})
public class ServletEspacio extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
           
            // Enviamos a la factory method el tipo de espacio que deseamos crear
            String valor = request.getParameter("espacio");
            
            ITipoEspacio espacio = FactoryTipoEspacio.crearEspacio(valor);
            
            
            //redireccion según template
            
            if(espacio.crearLugar() == "TEATRO"){
                
                request.getSession().setAttribute("result", espacio.crearLugar());
                response.sendRedirect("CrearTeatro.jsp");
            
            }else if(espacio.crearLugar() == "SALON"){
                 request.getSession().setAttribute("result", espacio.crearLugar());
                 response.sendRedirect("CrearSalon.jsp");
            
            }else if(espacio.crearLugar()=="AUDITORIO"){
                 request.getSession().setAttribute("result", espacio.crearLugar());
                 response.sendRedirect("CrearAuditorio.jsp");
            
            }else if(espacio.crearLugar()=="LABORATORIO"){
                 request.getSession().setAttribute("result", espacio.crearLugar());
                 response.sendRedirect("CrearLaboratorio.jsp");
            }
            
           
        
            
            
            
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
