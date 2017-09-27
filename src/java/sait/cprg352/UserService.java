/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import javax.servlet.http.HttpServlet;

/**
 *
 * @author 734743
 */
public class UserService extends HttpServlet {
    
    private String password = "password";
    private String userName1 = "adam";
    private String userName2 = "betty";
    boolean valid;
            
    public boolean login(String username, String password)
    {
        valid = false;
        
        if (username.equals(userName1)||username.equals(userName2)&&password.equals(password)) 
        {
            valid = true;
        }
        return valid;
    }
    
}
