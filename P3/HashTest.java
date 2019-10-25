/*
hashtable --  creates array of hashobjs cna have counts here
hashtest - creates the hashtable amd has the probs and the counts 
end of program should be able to print all the numbers
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/*
 * 
 * AUTHOR: AMARA TARIQ
 * CS321 
 * PROJECT 3 - HASHTABLES
 * 
 * HashTest.java -- driver class
 * 
 */

public class HashTest{
	private static double loadFactor;
	public static void main (String[] args) {
		loadFactor = Double.parseDouble(args[1]); //grabbing load factor from input
		
		if(args.length == 2 || Integer.parseInt(args[2]) == 0) {
			if(Integer.parseInt(args[0]) ==1) {
				//debug smth
				//exit?
			}else if(Integer.parseInt(args[0]==2)) {
				//debug smth
				//exit
			}
		}
		
		//if(args.length =)
		
//		PrimeGenerator p = new PrimeGenerator();
//		System.out.println(p.TwinPrimes(95500, 96000));
	}
	
}
