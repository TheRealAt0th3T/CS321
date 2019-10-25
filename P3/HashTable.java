
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
	
	private int linearProbeCount, doubleProbeCount;
	private int linearInput, doubleInput;
	private int duplicateLinearCount, duplicateDoubleCount;
	
	public HashTable(int load, int debug) {
		load = this.loadFactor;
		debug = this.debugLevel;
		//size = ; // --------------based off the primeGeneraator
		Table = new HashObject[size];
	}
	
	/*
	 * GET METHODS
	 */
	public int getSize() {
		return this.size;
	}
	
	public int getLinearProbes() {
		return linearProbeCount;
	}
	
	public int getDoubleProbes() {
		return doubleProbeCount;
	}
	
	public int getDuplicateDouble() {
		return duplicateDoubleCount;
	}
	
	public int getDuplicateLinear() {
		return duplicateLinearCount;
	}
	
	public int  getLinearInput() {
		return linearInput;
	}
	
	public int getDoubleInput() {
		return doubleInput;
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
	
	/*
	 * PROBING AND HASHING METHODS
	 */
	
	public int linearProbe(HashObject<T> obj) {
		int itr = 0; //iterations
		int objKey = obj.getKey();
		int index = (linearHashFunction(objKey) + itr) % this.size;
		linearProbeCount++; 
		while(itr<this.size) {
			itr++;
			if(Table[index] != null && Table[index]==obj) { //COLLISION
				//-----------------------------------------------------
				duplicateLinearCount++; //because found obj -> collision
				return index; 
			} else if( Table[index] == null) { //INSERTS OBJ
				Table[index] = obj;
				linearInput++;
				return index;
			}
			linearProbeCount++;
		}
		return index;
	}
	
	public void doubleHashing(HashObject<T> obj) {
		int objKey = obj.getKey();
		int index = objKey % this.size;
		int step = doubleHashFunction(objKey);
		
		while(Table[index]!= null) {
			if(Table[index] == obj) { //found the obj already in that place
				duplicateDoubleCount++;
				return; //breaks out once finds a duplicate
			}else { //space filled so need to take a step
				doubleProbeCount++;
				index = index + step;
				index = index % size;
			}
		}
		if(Table[index] == null) {
			Table[index] = obj;
			doubleInput++;
		}
	}
	
	
	/*
	 * AVG PROB CALCULATIONS
	 */
	public double avgProbesLinear() {
		return (double) linearProbeCount/ linearInput;
	}
	
	public double avgProbesDouble() {
		return (double) doubleProbeCount / doubleInput;
	}
	
	/*
	 * OUTPUT METHODS
	 */
	
}
