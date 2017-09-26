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
    private String firstName = "";
    private String lastName = "";
    
    public User(){
        firstName = "";
        lastName = "";
    }
    
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
}
