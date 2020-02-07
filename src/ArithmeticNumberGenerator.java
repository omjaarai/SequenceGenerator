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
 * Allows users to generate arithmetic series 
 *
 */

public class ArithmeticNumberGenerator implements NumberGenerator {
    private final int init; // first term in the sequence
    private final int diff; // common difference
    private int result=0;

    /**
     * Constructs an arithmetic number generator with given
     * start value init and common difference diff
     * @param init start value
     * @param diff common difference
     * @throws IllegalArgumentException if any of the input arguments
     * is illegal
     */
    public ArithmeticNumberGenerator(int init, int diff) 
        throws IllegalArgumentException{
        this.init=init;
        this.diff=diff;// Your code comes here
    }


    @Override
    public int generateNumber(int n) {
        if(n!=0) {

            result = generateNumber(n - 1) + diff;
        } else {
            
            return init;
        }
        return result;
        
        // Time Complexity: O(n)
        // This method generates the number of index n
        // in an arithmetic sequence recursively
    }
    
    // TEST FOR PRINTING
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ArithmeticNumberGenerator a = new ArithmeticNumberGenerator(2, 2);
            System.out.print(a.generateNumber(i) + " ");
        }
    }
}