/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
/**
 *
 * @author 734743
 */
public class User implements Serializable{
    private String userName = "";
    private String password = "";
    
    public User(){
        userName = "";
        password = "";
    }
    
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setLastName(String password) {
        this.password = password;
    }
}
