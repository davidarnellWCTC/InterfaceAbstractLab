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
public class StartLab2 {
    public static void main(String[] args) {
        
//        IntroToProgrammingCourse pc = new IntroToProgrammingCourse("asdf", "1234");
//        
//        System.out.println(pc.getCourseName());
        ProgrammingCourse[] pc = {
            new IntroToProgrammingCourse("lab2Intro1","1234"), 
            new IntroToProgrammingCourse("lab2Intro2","ABCD"),
            new IntroJavaCourse("lab2IntroJava","5678"),
            new AdvancedJavaCourse("lab2AdvancedJava","EFGH")
        };
        
        System.out.println("for loop get name");
        for(ProgrammingCourse i : pc) {
            System.out.println(i.getCourseName());
        }
        
        //pc[2].setPrerequisites("lab2Intro1");
        // The method is not shared
        // Substitution will not work
        
        IntroJavaCourse iJC = new IntroJavaCourse("lab2IntroJava","5678");
        AdvancedJavaCourse aJC = new AdvancedJavaCourse("lab2AdvancedJava","EFGH");
        
        iJC.setPrerequisites("IntroToProgramming");
        aJC.setPrerequisites("IntroJavaCourse");
        
        // Substitution will not work for the prerequisite method
        // Not all classes have prerequisites or the method, it's not shared
        for (ProgrammingCourse i : pc){
            //System.out.println(i.getPrerequisite);
        }
        
        // Unable to figure out how to get the prerequisites to print
        // using any substitution.
        //System.out.println(pc[2].getPrerequisites());
        System.out.println(iJC.getPrerequisites());
        System.out.println(aJC.getPrerequisites());
    }
    
}
