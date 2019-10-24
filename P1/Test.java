
/*
 * AUTHOR: AMARA TARIQ
 * CLASS: CS321
 * PROJECT 1: CACHE
 * 
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
	private static boolean SecondLayer = false;
	private static Cache<String> cache1, cache2;

	public static void main(String[] args) {
		if (args.length < 1) { // if less arguments than needed to run
			System.out.println("INVALID FORMAT");
			System.exit(1);
		}
		if (args[0].equals("1")) { // TEST 1 but not enough arguments
			if (args.length < 3) {
				System.out.println("INVALID FORMAT");
				System.exit(1);
			} else { // creating cache1
				cache1 = new Cache<>(Integer.parseInt(args[1]));
				scanningInFile(new File(args[2]));
			}
		} else if (args[0].equals("2")) { // TEST 2
			if (args.length < 4) { // making sure enough arguments
				System.out.println("INVALID FORMAT");
				System.exit(1);
			}
			if (Integer.parseInt(args[2]) <= Integer.parseInt(args[1])) { // checking sizing of cache2
				System.out.println("INVALID SIZING ERROR");
				System.exit(1);
			}

			// creating the caches
			cache1 = new Cache<>(Integer.parseInt(args[1]));
			cache2 = new Cache<>(Integer.parseInt(args[2]));
			SecondLayer = true; // bool for that there is a secondary cache

			scanningInFile(new File(args[3])); // scanning in passed in text file to use

		} else { // for any other case that smth went wrong
			System.out.println("INVALID FORMAT");
			System.exit(1);
		}
	}

	private static void scanningInFile(File xfile) { // scanner to get text from file

		int nr = 0; // global total references
		int nr1 = 0; // references for cache 1
		double nh1 = 0, nh2 = 0; // number of hits for cache1 and cache2

		try {
			Scanner xscanner = new Scanner(xfile); // creating scanner

			if (SecondLayer) { // if cache2
				System.out.println("One-level cache with " + cache1.getMax() + " nodes has been created.");
				System.out.println("2nd-Level cache with " + cache2.getMax() + " nodes has been created.");
			} else {// if only cache1
				System.out.println("2nd-Level cache with " + cache1.getMax() + " nodes has been created.");
			}
			while (xscanner.hasNextLine()) { // scanning and splitting the text file to be abel to store into the cache
				String next = xscanner.nextLine();
				StringTokenizer tokenizing = new StringTokenizer(next, " ");

				String token; // the actual object/string going into the caches
				nr += tokenizing.countTokens();
				while (tokenizing.hasMoreTokens()) {
					token = tokenizing.nextToken();
					if (SecondLayer) {// anything to cache1 has to also be added to cache2 //WHERE THERE IS A CACHE2
						if (cache1.contains(token)) {
							cache1.addObject(token);
							cache2.addObject(token);
							nh1++;
						} else {// if not found in cache1
							if (cache2.contains(token)) { // if not in cache1, check cache2
								cache2.addObject(token);
								nh2++;
							}
							// add to other cache as well
							cache1.addObject(token);
							nr1++;
						}
						cache1.addObject(token);
						cache2.addObject(token);
					} else if (!SecondLayer) { // not two caches
						if (cache1.contains(token)) {
							cache1.addObject(token);
							nh1++;
						} else {
							nr1++; //cause youre still referencing the cache
						}
						cache1.addObject(token);
					}
				}
			}
			xscanner.close();

			System.out.println("Number of global references: " + nr);

			if (!SecondLayer) { // if single level cache
				System.out.println("Number of references to 1st-level cache: " + nr1);
				System.out.println("Number of 1st-level cache hits: " + nh1);
				System.out.println("Number of global cache hits: " + (int) nh1);
				System.out.println("Global cache hit ratio: " + (int) nh1 / nr);

			} else if (SecondLayer) {// otherwise print for two level cache values

				System.out.println("Number of global hits: " + (int) (nh1 + nh2));
				System.out.println("Global cache hit ratio: " + ((nh1 + nh2)) / nr);
				System.out.println("Number of 1st-Level references: " + nr);
				System.out.println("Number of 1st-Level cache hits: " + (int) nh1);
				System.out.println("The 1st-Level cache hit ratio: " + (nh1 / nr));

				System.out.println("Number of 2nd-Level references: " + (int) nr1);
				System.out.println("Number of 2nd-Level cache hits: " + (int) nh2);
				System.out.println("The 2nd-Level cache hit ratio: " + (nh2 / nr1));

			}

		} catch (FileNotFoundException e) {
			System.out.println("INVALID FILE");
		}

	}

}
