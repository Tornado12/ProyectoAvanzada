/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Auditorio;
import Model.Laboratorio;
import Model.Salon;
import Model.Teatro;
import Servicios.EspaciosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Javier
 */
@WebServlet(name = "ServletProcesarFactory", urlPatterns = {"/ServletProcesarFactory"})
public class ServletProcesarFactory extends HttpServlet {

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
           
             HttpSession session = request.getSession();
            
            Salon aula= new Salon();
            Auditorio audi = new Auditorio();
            Laboratorio lab = new Laboratorio();
            Teatro teat = new Teatro();
            EspaciosDAO guardar = new EspaciosDAO();
            
            
            
             
            /* GUARDAR LUGAR */
           
            String caso = request.getParameter("lugar");
            
            if(caso.equals("TEATRO")){
                teat.setNombre(request.getParameter("nombre"));
                teat.setTorre(request.getParameter("torre"));
                teat.setVideoBeam(request.getParameter("video"));
                teat.setComputadores(request.getParameter("comp"));
                teat.setCapacidad(request.getParameter("capacidad"));
                
                boolean test;
                
                
                test = guardar.GuardarTeatro(teat);
                
                 if (test==true) {
                   
                    request.getSession().setAttribute("result", "Teatro registrado exitosamente");
                    response.sendRedirect("Mensaje.jsp");
                  
                } else {
                  
                    request.getSession().setAttribute("result", "Error al registrar teatro");
                    response.sendRedirect("Mensaje.jsp");
                    
                }
              
                
                
            } else if(caso.equals("SALON")){
                
                aula.setNombre(request.getParameter("nombre"));
                aula.setTorre(request.getParameter("torre"));
                aula.setVideoBeam(request.getParameter("video"));
                aula.setComputadores(request.getParameter("comp"));
                aula.setCapacidad(request.getParameter("capacidad"));
                
                boolean test;
                
                
                test = guardar.GuardarSalon(aula);
                
                 if (test==true) {
                   
                    request.getSession().setAttribute("result", "Salon registrado exitosamente");
                    response.sendRedirect("Mensaje.jsp");
                  
                } else {
                  
                    request.getSession().setAttribute("result", "Error al registrar salon");
                    response.sendRedirect("Mensaje.jsp");
                    
                }
                
                
            
            }else if(caso.equals("AUDITORIO")){
                
                
                 
                audi.setNombre(request.getParameter("nombre"));
                audi.setVideoBeam(request.getParameter("video"));
                audi.setComputadores(request.getParameter("comp"));
                audi.setCapacidad(request.getParameter("capacidad"));
                
                boolean test;
                
                
                test = guardar.GuardarAuditorio(audi);
                
                 if (test==true) {
                   
                    request.getSession().setAttribute("result", "Auditorio registrado exitosamente");
                    response.sendRedirect("Mensaje.jsp");
                  
                } else {
                  
                    request.getSession().setAttribute("result", "Error al registrar auditorio");
                    response.sendRedirect("Mensaje.jsp");
                    
                }
            
            }else if(caso.equals("LABORATORIO")){
                
                
                lab.setNombre(request.getParameter("nombre"));
                lab.setTorre(request.getParameter("torre"));
                lab.setVideoBeam(request.getParameter("video"));
                lab.setComputadores(request.getParameter("comp"));
                lab.setCapacidad(request.getParameter("capacidad"));
                
                boolean test;
                
                
                test = guardar.GuardarLaboratorio(lab);
                
                 if (test==true) {
                   
                    request.getSession().setAttribute("result", "Laboratorio registrado exitosamente");
                    response.sendRedirect("Mensaje.jsp");
                  
                } else {
                  
                    request.getSession().setAttribute("result", "Error al registrar laboratorio");
                    response.sendRedirect("Mensaje.jsp");
                    
                }
                
                
                
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
