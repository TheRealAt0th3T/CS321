
/*
 * AUTHOR: AMARA TARIQ
 * CLASS: CS321
 * PROJECT 1: CACHE
 * 
 */

import java.util.LinkedList;

public class Cache<T> {
	private LinkedList<T> Cache;
	private int size;

	// initializes based on parameter provided at command line
	public Cache(int cachesize) {
		size = cachesize;
		Cache = new LinkedList<>(); // creating the cache linkedlist
	}

	public T getObject(T Object) { // find object within the cache
		T toGet = Cache.get(Cache.indexOf(Object));
		addObject(toGet);
		return toGet;
	}

	public void addObject(T Object) {
		if (Cache.size() < size) { // is cache full?
			if (Cache.contains(Object)) { // if found, remove and add to front
				Cache.remove(Object);
			}
			Cache.addFirst(Object);
		} else {// if found, remove and add to front
			if (Cache.contains(Object)) {
				Cache.remove(Object);
				Cache.addFirst(Object);
			} else { // if not found, remove obj at end and add new obj to front
				Cache.removeLast();
				Cache.addFirst(Object);
			}
		}
	}

	public void removeObject(T Object) { // simply removes
		Cache.remove(Object);
	}

	public boolean contains(T Object) { // checks if cache contains the object passed in
		return Cache.contains(Object);
	}

	public int getMax() { // Returning the size of the cache
		return size;
	}

}
