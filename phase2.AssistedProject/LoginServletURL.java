package core.programs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/LoginServletURL")
public class LoginServletURL extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
    public LoginServletURL() {
        super();
        // TODO Auto-generated constructor stub
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
            String userId = request.getParameter("userid");
        response.sendRedirect("DashboardURL?userid=" + userId);  
           
   }

}