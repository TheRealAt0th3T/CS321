/*
hashtable --  creates array of hashobjs cna have counts here
hashtest - creates the hashtable amd has the probs and the counts 
end of program should be able to print all the numbers
*/

import java.io.File;
import java.io.FileNotFoundException;
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

// added comment 

public class HashTest {
	private static double loadFactor;

	public static void main(String[] args) {
		loadFactor = Double.parseDouble(args[1]); // grabbing load factor from input

		if (args.length == 2 || Integer.parseInt(args[2]) == 0) {
			if (Integer.parseInt(args[0]) == 1) { // INPUT TYPE 1
				debugLevelZero();
				// exit?
			} else if (Integer.parseInt(args[0]) == 2) { //INPUT TYPE 2
				// debug smth
				// exit
			}else if(Integer.parseInt(args[0]) ==3){ //INPUT TYPE 3
				//
				//
			}
		}
		if (args.length == 3) { // IF THREE ARGUMENTS PASSED IN - INPUT. LOAD AND DEBUG
			int debugLevel = Integer.parseInt(args[2]);
			if (Integer.parseInt(args[0]) == 1) { //INPUT TYPE 1
				if (debugLevel == 1) { //DEBUG LEVEL 1

				}
				if (debugLevel == 2) { //DEBUG LEVEL 2

				}
			} else if (Integer.parseInt(args[0]) == 2) { //INPUT TYPE 2
				if (debugLevel == 1) { //DEBUG LEVEL 1

				}
				if (debugLevel == 2) { //DEBUG LEVEL 2

				}
			} else if (Integer.parseInt(args[0]) == 3) {//INPUT TYPE 3
				if (debugLevel == 1) { //DEBUG LEVEL 1

				}
				if (debugLevel == 2) { //DEBUG LEVEL 2

				}
			}
		}
	}
		public static void debugLevelZero() { //general output without table output -- DEBUG LEVEL 0
			HashTable<String> Linear = new HashTable<String>(load, 0);
			DoubleHash<String> Double = new DoubleHash<String>(load, 0);
			
			System.out.println("A good table size is found: " + Linear.getSize());
			System.out.println("Data Source Type: word-list\n\n");
			
			System.out.println("Using Linear Hashing...\n");
			while(linear.getLoad()<loadFactor) { //filling the hashtable
				HashObject<String> input = new HashObject<String>();
				Linear.linearProbe(input);
				Double.doubleHashing(input);
			}
			
			System.out.println("Input " + Linear.getLinearInput() + "elements, of which " + Linear.getDuplicatesLinear() + "duplicates" );
			System.out.println("load factor = " + loadFactor + ", Avg. no. of probes " + Linear.avgProbesLinear() + "\n\n");\
			
			System.out.println("Using Double Hashing...\n");
			System.out.println("Input " + Double.getDoubleInput() + "elements, of which " + Double.getDuplicatesDouble() + "duplicates" );
			System.out.println("load factor = " + loadFactor + ", Avg. no. of probes " + Double.avgProbesDouble() + "\n\n");\
			
		}
		
		public static void debugLevelOne() { //output with hashtables -- DEBUG LEVEL 1
			
		}

		// if(args.length =)

//		PrimeGenerator p = new PrimeGenerator();
//		System.out.println(p.TwinPrimes(95500, 96000));
	

}
