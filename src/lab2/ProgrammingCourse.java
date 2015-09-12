/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author David
 */
public interface ProgrammingCourse {
    
//        private String courseName;
//    private String courseNumber;
//    private double credits;
    
    public abstract String getCourseName();
    public abstract void setCourseName();
    
    public abstract String getCourseNumber();
    public abstract void setCourseNumber();
    
    public abstract double getCourseCredits();
    public abstract void setCourseCredits();
    
    
}
