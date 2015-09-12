package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
//    String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        } else {
            this.prerequisites = prerequisites;
        }
    }
    

    public double getCredits() {
        return credits;
    }


    public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        } else {
            this.credits = credits;
        }
    }
//    public String getCourseNumber() {
//        return courseNumber;
//    }

//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }



}
