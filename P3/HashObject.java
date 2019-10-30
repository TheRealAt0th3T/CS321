import java.util.Random;

/*
 * AUTHOR: AMARA TARIQ
 * CS321 
 * PROJECT 3 - HASHTABLES
 * 
 * HashObject.java
 * 
 */

public class HashObject <T>{
	
	private T hashObj;
	private int key; //data source 1
	private int timeKey; //data source 2 //call to systen.currentTimeMillis() ??
	private int wordKey; //data source 3
	Random rand = new Random();
	
	public HashObject(T object) {
		
		this.key = rand.nextInt(); //---------------------------
		this.timeKey = 0; 
		this.hashObj = object; //compute the hashCode??
		
	}
	
	/*
	 * GET METHODS
	 */
	public int getKey() {
		return this.key;
	}
	
	public int getTimeKey() {
		return this.timeKey;
	}
	
	public int getWordKey() {
		return this.wordKey;
	}
	
	public String getObject() {
		return this.hashObj;
	}
	
	/*
	 * INCREASE METHODS 
	 */
	
	public void increaseTimeKey() {
		this.timeKey++;
	}
	
	/*
	 * ISEQUAL METHODS
	 */
	public boolean isEqual(HashObject<T> obj) {
		if(obj.getObject().equals(hashObj)) {
			return true;
		}else {
			return false;
		}
	}
	
}
