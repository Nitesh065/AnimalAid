package mypakge;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowImage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //String imgid=request.getParameter("imgid");
        try {
            Connection con = Connect.connect();
            String qr = "select*from Image";
            PreparedStatement ps = con.prepareStatement(qr);
            ResultSet rs = ps.executeQuery();
            out.println("<html>");
            out.println("<body>");
            out.println("<hr>");
            out.println("<table broder=2");
            while (rs.next()) {
                String s1 = rs.getString(2);
                String s2 = rs.getString(3);
                String s3 = rs.getString(4);
                String s4 = rs.getString    (5);

                out.println("<tr>");
                out.println("<tr>");
                out.println("<th>Imge</th>");
                out.println("<td> <img width=500 height=800 src=\"ViewImage?id=" + s2 + "\"></td>");
                out.println("</tr>");
                out.println("<tr>");  
                out.println("<th>Date</th>");
                out.println("<td>" + s1 + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<th>id</th>");
                out.println("<td>" + s2 + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<th>Address</th>");
                out.println("<td>" + s3 + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<th>Mobile</th>");
                out.println("<td>" + s4 + "</td>");
                out.println("</tr>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
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
