/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author User
 */
public class students {
    private String fullname;
    private String age;
    private String major;
    private String batch;
    
     public void setAge(String age){
        this.age = age;
    }
    
    public String getAge(){
        return this.age;
    }
    
     public void setFullname(String fn){
        this.fullname = fn;
    }
    
    public String getFullname(){
        return this.fullname;
    }
    
    public void setMajor(String mj){
        this.major = mj;
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public void setBatch(String bt){
        this.batch = bt;
    }
    
    public String getBatch(){
        return this.batch;
    }
}
