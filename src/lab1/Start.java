/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author David
 */
public class Start {
    
    public static void main(String[] args) {
        
        // This class is mostly to just test out the ProgrammingCourse class
        // and the child classes that inherit from it.
        // I'm using concrete(?) variables just for testing
        
//        ProgrammingCourse pcIntro1 = new IntroToProgrammingCourse("Intro1","1234");
//        ProgrammingCourse pcIntro2 = new IntroToProgrammingCourse("Intro2","ABCD");
        
        ProgrammingCourse[] pc = {
            new IntroToProgrammingCourse("Intro1","1234"), 
            new IntroToProgrammingCourse("Intro2","ABCD"),
            new IntroJavaCourse("IntroJava","5678"),
            new AdvancedJavaCourse("AdvancedJava","EFGH")
        };
        
//        System.out.println(pc[0].courseName);
//        System.out.println(pc[1].courseName);
        // The above worked and gave two separate values for the courseName
        
        System.out.println("for loop get name");
        for(ProgrammingCourse i : pc) {
            System.out.println(i.getCourseName());
        }
        
        System.out.println("Resetting the courseNumber");
        //for (ProgrammingCourse a : pc) {
        // couldn't get the fancy way of doing a for-string to work twice
        // No idea why it wouldnt work
        for (int a = 0; a < pc.length; a++) {            
            //System.out.println(a);
            String newCourseNumber = Integer.toString(a);
            pc[a].setCourseNumber(newCourseNumber);
            System.out.println(pc[a].getCourseName() + " " 
                    + pc[a].getCourseNumber());
            // method 2
            System.out.println(pc[a].courseName + pc[a].courseNumber);
        }
        
        for (ProgrammingCourse i : pc){
            //System.out.println(i.courseName);
        }
        
        // Resetting the courseName
//        pc[0].setCourseName("Intro1Reset");
//        pc[1].setCourseName("Intro2Reset");
        
//        System.out.println(pc[0].getCourseName());
//        System.out.println(pc[1].getCourseName());
//        System.out.println(pc[0].courseName);
//        System.out.println(pc[1].courseName);
        // Resetting the course name worked
        // There are two ways of getting the courseName
        // Not sure which way is better or preferred...
        
    }
    
}
