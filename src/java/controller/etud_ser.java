/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sony
 */
@WebServlet(name = "etud_ser", urlPatterns = {"/etud_ser"})
public class etud_ser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
  
     */
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int n1=Integer.parseInt(request.getParameter("note1")) ;
        int n2=Integer.parseInt(request.getParameter("note2"));
        float m=(n1+n2)/2;
        request.setAttribute("m", m);
        request.getRequestDispatcher("calcul.jsp").forward( request,response);
    }
}
