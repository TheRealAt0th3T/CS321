import java.util.Random;
import java.lang.Math;

/*
 * AUTHOR: AMARA TARIQ
 * CS321 
 * PROJECT 3 - HASHTABLES
 * 
 * PrimeGenerator.java
 * 
 */

public class PrimeGenerator {
	Random random = new Random();
	public int TwinPrimes(int min, int max) {
		int p = min;
		int a = random.nextInt(p-2)+2;
		double num = 0;
		int lastPrime = 0;

		for ( p = min; p < max; p++) { // LOOPING THROUGH RANGE

			num = a;
			String binary = Integer.toBinaryString(p-1);

			for (int i = 1; i < binary.length(); i++) { // LOOPING THROUGH BINARY NUMBER
				if ((binary.charAt(i)) == '0') { // if binary has 0
					//num = (num * num) % p;
					num = Math.pow(num,2);
					num %= p;
				} else if ((binary.charAt(i)) == '1') { // if binary has 1
					//num = (num * num * a) % p;
					num = Math.pow(num,2);
					num*=a;
					num%=p;
				}
			}

			if (num == 1) {
				if (lastPrime == (p - 2)) { //checking second prime number
					return lastPrime;
				} else {	// else if only found one prime
					lastPrime = p;
				}
			}
		}
		return 0;
	}
	
//	public PrimeGenerator() {
//		int i =0;
//	}
	
}
