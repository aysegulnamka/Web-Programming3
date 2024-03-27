package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/UserRegister")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        PrintWriter pw = res.getWriter();
        
        res.setContentType("text/html");
        
        String name = req.getParameter("name");
        
        String last_name = req.getParameter("last_name");
       
        String email = req.getParameter("email");
        
        String password = req.getParameter("password");
        
        String maskedPassword = "*".repeat(password.length());  /* Maskeleme */
        
        pw.println(
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n"
                        + "\r\n" + "<!-- jQuery library -->\r\n"
                        + "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n"
                        + "\r\n" + "<!-- Popper JS -->\r\n"
                        + "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n"
                        + "\r\n" + "<!-- Latest compiled JavaScript -->\r\n"
                        + "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>");
        
        // print data
        pw.println("<div style='width:600px;margin:auto;margin-top:50px;'>");
        pw.println("<table class='table table-hover table-striped'>");
        pw.println("<tr>");
        pw.println("<td>Name</td>");
        pw.println("<td>" + name + "</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td>Last Name</td>");
        pw.println("<td>" + last_name + "</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td>E-mail</td>");
        pw.println("<td>" + email + "</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td>Password</td>");
        pw.println("<td>" + maskedPassword + "</td>");
        pw.println("</tr>");
        pw.println("</table>");
        pw.println("</div>");
        
       
        // close the stream
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}