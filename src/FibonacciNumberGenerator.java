////////////////////ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
//Title:           Sequence Generator
//Files:           none
//Course:          CS 300 spring 2018
//
//Author:          Omjaa Rai
//Email:           orai@wisc.edu
//Lecturer's Name: Mouna Ayari Ben Hadj Kacem
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
//Students who get help from sources other than their partner must fully
//acknowledge and credit those sources of help here.  Instructors and TAs do
//not need to be credited here, but tutors, friends, relatives, room mates
//strangers, etc do.  If you received no outside help from either type of
//source, then please explicitly indicate NONE.
//
//Persons:         none
//Online Sources:  none
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
 
/**
 * allows users to generate fibonacci series
 *
 */
 
public class FibonacciNumberGenerator implements NumberGenerator {


    @Override
    public int generateNumber(int n) {
        // Time Complexity: O(n)

        int C = 0;
        int A = 0;
        int B = 1;
        while(n-1 >= 0) {
            C = A+B;

            A = B;
            B = C;
            n--;
        }
        return A;



    }
    //TEST FOR PRINTING
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            FibonacciNumberGenerator a = new FibonacciNumberGenerator();
            System.out.print(a.generateNumber(i) + " ");
        }
    }
}
