/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.BDregistrarUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author braya
 */
@WebServlet(name = "registrarUsuario", urlPatterns = {"/registrarUsuario", "/registrarUsuarioServlet"})
public class registrarUsuarioServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        BDregistrarUsuario reg_u = new BDregistrarUsuario();
        
        try {
            
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registrarUsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registrarUsuarioServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
            
            String usuario = request.getParameter("user");
            String contraseña = request.getParameter("password");
            String apellido = request.getParameter("lastnameu");
            String nombre = request.getParameter("nameu");
            String edad = request.getParameter("age");
            reg_u.consigue_id();
            reg_u.inserta_tdatosusuario(apellido, nombre, edad);
            reg_u.inserta_tusuarios(usuario, contraseña);  
            
            response.sendRedirect("index.jsp");
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registrarUsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registrarUsuarioServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
        } catch (Exception e) {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inicio</title>");
            out.println("</head>");
            out.println("<body>");
            /*out.println("<h1>Error at " + e.toString() + "</h1>");
            out.println("<p>Error: " +  copia.getMensaje() + "</p>");
            out.println("<p>Error: " +  reserva.getMensaje() + "</p>");
            out.println("<p>Error: " +  e.getMessage() + "</p>");*/
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
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
