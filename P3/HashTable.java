
/*
 * AUTHOR: AMARA TARIQ
 * CS321 
 * PROJECT 3 - HASHTABLES
 * 
 * HashTable.java
 * 
 */

public class HashTable <T>{
	
	private HashObject <T> Table[];
	public int loadFactor;
	public int size; //size of table
	public int debugLevel; 
	
	public HashTable(int load, int debug) {
		load = this.loadFactor;
		debug = this.debugLevel;
		//size = ;
		Table = new HashObject[size];
	}
	
	/*
	 * GET METHODS
	 */
	public int getSize() {
		return this.size;
	}
	
	/*
	 * HASH FUNCTIONS
	 * based off equations
	 */
	public int linearHashFunction(int key) {
		return key % this.size;
	}
	
	public int doubleHashFunction(int key) {
		return 1 + (key % (this.size-2));
	}
	
	
	
}
