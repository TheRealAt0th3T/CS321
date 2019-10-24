/*
 * AUTHOR: AMARA TARIQ
 * CLASS: CS321 YEH
 * PROJECT 2 LAB 2 
 * CPU SCHEDULING
 * 
 * MaxHeap.java
 * 
 * Defines a max-heap. 
 * each node contains a process.
 * 
 */

import java.util.ArrayList;

public class MaxHeap extends ArrayList{
	
	public ArrayList<Process> mHeap; //maxheap with all the processes
	
	/*
	 * initializer -- creating the mHeap
	 */
	public MaxHeap() {
		mHeap = new ArrayList<Process>;
	}
	
	/*
	 * Get the size of the heap
	 */
	public int getSize() {
		return mHeap.size();
	}
	
	/*
	 * creating the maxHeap
	 */
	public void createMaxHeap() {
		for(int i = (getSize()-1)/2; i>0;i--) {
			
		}
	}
	
	/*
	 * adding new process to maxheap
	 * adding a new node requires for the entire tree to be recreated
	 */
	public void addNode(Process process) {
		mHeap.add(process);
		createMaxHeap();
	}
	
	public void removeNode() {
		mHeap.remove(mHeap.indexOf(mHeap.size()-1)); //-----------------------?
	}
	
	public boolean isEmpty() {
		return mHeap.isEmpty();
	}
	
	/* 
	 * returns process and its details
	 */
	public Process getProcess(int index) {
		return mHeap.get(index);
	}
	
	/*
	 *  ----------------------------------?
	 */
	public void swap() {
		
	}
	
	/* 
	 * -----------------------------------------?
	 */
	public void swapDown(int index) {
		
	}
	
	
}