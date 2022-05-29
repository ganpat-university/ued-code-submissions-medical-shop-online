package Project;

import java.io.IOException;
import java.io.*;
import java.sql.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Date;
@WebServlet(urlPatterns = {"/adminloginlogic"})
public class login extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req,
                        HttpServletResponse resp)
                        throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
               int count=0;
			String in1 = req.getParameter("Name");
			String in2 = req.getParameter("Password");
			if(in1.equals("Admin")) {
				if(in2.equals("Admin123")) {
					count+=1;
				}	
				
			}
			if(count==1) {
				RequestDispatcher rd=req.getRequestDispatcher("admin.jsp");
				rd.forward(req,resp);				
			}
			else {
				RequestDispatcher rd1=req.getRequestDispatcher("admin_dash_false.jsp");
				rd1.include(req, resp);
			}
				
        
			
    }
}