/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb2;

import java.io.Serializable;

/**
 *
 * @author localuser
 */
public class Course implements Serializable {
    private String courseCode;
    private String courseDescription;
    
    public Course(String courseCode, String courseDescription){
        
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        
    }
    
    public String getcourseCode(){
        return courseCode;
    }
    
    public void setcourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    
    public String setcourseDescription(){
        return courseDescription;
    }
    
    public void setcourseDescription(String courseDescription){
        this.courseDescription = courseDescription;
    }
    
}
