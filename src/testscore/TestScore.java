/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testscore;

/**
 *
 * @author class
 */
public class TestScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO: Declare and initialize test scores as int.
        
        int testscore1 = 90 ;
        int testscore2 = 90 ;
        int testscore3 = 89 ;
        
         //TODO: Dispaly each test score, one per line.
        System.out.println("The score for test 1 is: " + testscore1);
        System.out.println("The score for test 2 is: " + testscore2);
        System.out.println("The score for test 3 is: " + testscore3);
        
        
        //TODO: Calculate the average of the test scores.
        double average = (testscore1 + testscore2 + testscore3)/3.0  ;
        
        //TODO: Output the average
        System.out.println("The average test score is: " + average);
    }
    
}
