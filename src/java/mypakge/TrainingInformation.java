
package mypakge;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TrainingInformation extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           PrintWriter out = response.getWriter();
           Connection con = mypakge.Connect.connect();
           java.util.Date dt = new java.util.Date();
           long time  = dt.getTime();
           java.sql.Date postdate = new java.sql.Date(time);
        try {
           PreparedStatement ps = con.prepareStatement("select max(notice_id) from notice");
           ResultSet rs = ps.executeQuery();
           rs.next();
           int lastid = rs.getInt(1);
           int newid = 100;
           if(lastid!=0)
           {
               newid = lastid+1;
           }
           
           PreparedStatement ps1 = con.prepareStatement("insert into notice values(?,?,?,?)");
           String title = request.getParameter("title");
           String information = request.getParameter("information");
           ps1.setInt(1,newid);
           ps1.setString(2,title);
           ps1.setString(3, information);
           ps1.setDate(4, postdate);
           ps1.executeUpdate();
        } catch (Exception e) {
            out.println(e);
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
