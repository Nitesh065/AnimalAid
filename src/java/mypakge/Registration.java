package mypakge;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {

    Connection con;
    PreparedStatement ps;

    public void init() {
        try {
            con = mypakge.Connect.connect();
            String qr = "insert into User values(?,?,?,?)";
            ps = con.prepareStatement(qr);
        } catch (Exception e) {
        }
    }

    public void destroy() {
        try {
            con.close();
        } catch (Exception e) {
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String Username = request.getParameter("username");
        String Email = request.getParameter("email");
        String Password = request.getParameter("password");
        String Mobile_no = request.getParameter("mobile_no");
        
        try {
            ps.setString(1,Username);
            ps.setString(2,Email);
            ps.setString(3,Password);
            ps.setString(4,Mobile_no);
            ps.executeUpdate();
            out.println("<h3>Registerd Seccessfully</h3>");
            out.println("<a href=Login.jsp>Login now</a>");
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
