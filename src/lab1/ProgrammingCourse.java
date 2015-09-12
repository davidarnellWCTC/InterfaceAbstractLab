/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author darnell
 */
public abstract class ProgrammingCourse {    
    
    // Each class that inherits from this abstract class has these
    // variables in common.
    public String courseName;
    public String courseNumber;
    public double credits;
    
    
    
    // Setting and Getting the Course Number
    // Each class has a course number that you would have to get and set
    // I cannot imagine a time when you would need to get or set them differently
    // The check on setting the course number is the same for each course, I assume
    final public String getCourseNumber() {
        return courseNumber;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    //Setting and Getting the Course Name
    final public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    // Capitalizing the Course Name
    // Only one of the child classes had this method
    // I'm not sure if that is on purpose. 
    // I figured it doesn't hurt to have that option with each class
    final public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
}
