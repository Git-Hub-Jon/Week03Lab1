/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.eclipse.jdt.internal.compiler.parser.Parser.name;

/**
 *
 * @author 734743
 */
public class LoginServlet extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            
            return;
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        UserService service = new UserService();
        
        if (name == null && pass == null){
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            
            return;
        }
        
        if (name.isEmpty() && pass.isEmpty()){
            request.setAttribute("errorMessage", "Please Enter Username and Password");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        if (name.isEmpty()){
            request.setAttribute("errorMessage", "Please Enter Username");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        if (pass.isEmpty()){
            request.setAttribute("errorMessage", "Please Enter Password");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        if (!name.equals("adam") && !name.equals("betty")) {
             request.setAttribute("errorMessage", "Please Enter Correct Username");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        if(!pass.equals("password")) {
                    request.setAttribute("errorMessage", "Invalid Login");
                    getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                }
    
        if(name.equals("adam") || name.equals("betty") && pass.equals("password")) {
            request.setAttribute("username", name);
            getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
        }
        
        }     
   }
                  



    


