
/*
 * AUTHOR: AMARA TARIQ
 * CLASS: CS321 YEH
 * PROJECT 2 LAB 2 
 * CPU SCHEDULING
 * 
 * PQueue.java
 * 
 * defines what a PQueue (priority queue) is:
 * 		uses a max heap in order to process processes passed to it
 * 
 */
import java.util.ArrayList;

public class PQueue {

	public MaxHeap heap = null; // creating the main heap

	/*
	 * intitializing PQueue done using a maxheap
	 */
	pubic PQueue() {
		heap = new MaxHeap();
	}

	/*
	 * classic enqueue for the priority queue
	 */
	public void enPqueue(Process process) {
		heap.rebuild(process);
	}

	/*
	 * classic dequeue for the priority queue
	 */
	public void dePQueue() {
		return heap.extractMax();
	}

	/*
	 * 
	 */
	public void isEmpty() {
		return heap.getSize() == 0;
	}

	/*
	 * update priorities: priority level
	 * 
	 */
	public void update(int timePriority, int plvl) {
		for (int i = 1; i < heap.getSize(); i++) {
			Process process = heap.getProcess(i);
			if (process.getTimeWaiting() > timePriority) {
				if (process.getPriority() > plvl) {
					process.resetTimeWaiting();
				}
			}
		}

	}

}