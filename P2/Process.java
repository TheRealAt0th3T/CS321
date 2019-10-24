
/*
 * AUTHOR: AMARA TARIQ
 * CLASS: CS321 YEH
 * PROJECT 2 LAB 2 
 * CPU SCHEDULING
 * 
 * Process.java
 * 
 * defines what a process is and what they contain:
 * 		priority level
 * 		time it takes to finish
 * 		arrival time
 * implements a compareTo method
 * 
 */

import java.util.ArrayList;

public class Process implements Comparable<Process> {

	public int timeToFinish, timeWaiting, arrivalTime, processingTime;
	public int priorityLevel;

	/*
	 * method called to actually create a process sets arrival time, process time,
	 * and priority level also sets the timewaiting to zero as it was just created
	 */
	public Process(int aTime, int pTime, int plvl) {
		priority = rand.nextInt(plvl);
		processingTime = rand.nextint(pTime);
		arrivalTime = aTime;
		timeWaiting = 0;
	}

	/*
	 * Comparison done between two nodes of the heap this checks the priority levels
	 * between the two processes the larger priority level has a higher priority and
	 * therefore gets to be processed first
	 */
	public void compareTo(Process process) {
		if (process.getPriority() > priorityLevel) {
			return 1;
		}
		if (process.getPriority() < priorityLevel) {
			return -1;
		} else if (process.getPriority() = priorityLevel) {
			return 0;
		}
	}

	/*
	 * Priority level methods getPriorityLevel increase and decrease priority levels
	 * set priority???????????????????????????????????????
	 */
	public void getPriorityLevel() {
		return priorityLevel;
	}

	public void decreasePriorityLevel() {
		return priorityLevel--;
	}

	public void increasePriorityLevel() {
		return priorityLevel++;
	}

	public void setPriorityLevel(int pl) {
		priority = pl;
	}

	/*
	 * Time methods
	 * 
	 */
	public int getArrivalTime() {
		return arrivalTime;
	}
	
	public void addFinishTime() {
		timeToFinish++;
	}
	
	public int getTimeWaiting() {
		return timeWaiting;
	}
	
	public void resetTimeWaiting() {
		timeWaiting = 0;
	}
	
	public void increaseTimeWaiting() {
		timeWaiting++;
	}
	
	public int getTimeToFinish() {
		return timeToFinish;
	}
	
	public void decreaseTimeToFinish() {
		timeToFinish--;
	}
	
	public void increaseTimeToFinish() {
		timeToFinish++;
	}
	
	/*
	 * is the processed finished being processed
	 */
	public boolean finished() {
		if(timeToFinish==0) {
			return true;
		}else {
			return false;
		}
	}
	

}