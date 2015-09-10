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
    public String courseName;
    public String courseNumber;
    public double credits;
    
    
    
    // Setting and Getting the Course Number
    public String getCourseNumber() {
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
    public String getCourseName() {
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
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
}
