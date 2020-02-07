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
import java.util.Iterator;
/**
 * Aids in iterating through sequence
 *
 */
 
public class SequenceIterator implements Iterator<Integer>{
    private NumberGenerator generator; // a NumberGenerator object
                // that generates and returns a number of index n in a 
                // sequence of numbers
    
    private int size;  // size of the sequence
    private int index; // index of the next number to be generated in the sequence
    
    /**
     * Constructs a SequenceIterator with given number generator and size
     * This constructs initializes also the index to 0
     * @param generator
     * @param size
     */
    public SequenceIterator(NumberGenerator generator, int size) {
        this.generator=generator;
        this.size=size;
        index=0;
    }
    
    @Override
    public boolean hasNext() {
        if(index < size) {
            return true;
        }else {
            return false;
        }
    }
    
    @Override
    public Integer next() {
        return generator.generateNumber(index); // Your code comes here
    }
 
}