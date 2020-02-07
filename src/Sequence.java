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
 * Composes and prints out sequence of number generator types
 *
 */
 
public class Sequence implements Iterable<Integer>{
    private NumberGenerator generator; // a NumberGenerator object
            // that generates and returns a number of index n in a 
            // sequence of numbers
    private int size; // Number of items in the sequence
    
    /**
     * Creates a Sequence of Integers with a given instance of
     * NumberGenerator and a given size
     * @param generator
     * @param size
     * @throws IllegalArgumentException if size is negative
     */
    public Sequence(NumberGenerator generator, int size) 
            throws IllegalArgumentException{
        
        this.generator = generator;
        this.size = size;
    } 
    
    
    @Override
    public Iterator<Integer> iterator() {
        
        return new SequenceIterator(generator,size);
    }
        
    @Override
    public String toString(){
        
        int n = 0;
        String finalString = "";
        while(n < size) {
        String string=Integer.toString(generator.generateNumber(n));
        finalString += string+ " ";
        n++;
        }
        return finalString;
    }
 
    public static void main(String[] args) {
        
        System.out.println("****************************************");
        System.out.println("           Sequence Generator");
        System.out.println("****************************************");
                 
        System.out.println("==========Arithmetic Sequence==========");
        Sequence sequence = new Sequence(new ArithmeticNumberGenerator(2,2),4);
        System.out.println(sequence.toString());
                 
        System.out.println("==========Geometric Sequence==========");
        sequence = new Sequence(new GeometricNumberGenerator(2,2),10);
        System.out.println(sequence.toString());
                 
        System.out.println("==========Fibonacci Sequence==========");
        sequence = new Sequence(new FibonacciNumberGenerator(),20);
        System.out.println(sequence.toString());
        
    }
    
}   