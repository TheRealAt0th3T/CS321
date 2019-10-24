/*
 * AUTHOR: AMARA TARIQ
 * CLASS: CS321 YEH
 * PROJECT 2 LAB 2 
 * CPU SCHEDULING
 * 
 * ProcessGenerator.java
 * 
 * Generates the processes that are being sent into the PQueue
 * these are being randomly generated
 * 
 * "At beginning of each time unit, whether a process will arrive 
 * is decided by the given probability. In addition, while 
 * generating a new process, both its priority and the required 
 * time units to finish theprocess are randomly generated within 
 * given ranges."
 * 
 */

import java.util.ArrayList;
import java.util.Random;


public class ProcessGenerator{
	
	private double probability;
	private Random random = new Random();
	
	/* 
	 * initializing the processGenerator which contains just the probability factor
	 */
	public ProcessGenerator(double prob) {
		prob = probablity;
	}
	
	/*
	 * generates random numbers for the arrival time, process time, and priority level
	 * and then calls method Process in order to actually create the process obj
	 */
	public Process createNewProcess(int aTime, int pTime, int pLvl){
		pLvl = rand.getNewInt(pLvl);
		pTime = rand.getNewInt(pTime);
		Process process = new Process(aTime, pTime, pLvl);
		return process;
	}
	/*
	 * Checks to see if a new process needs to be created
	 */
	public boolean makeProcess() {
		if (probability <= rand.nextDouble()) {
			return true;
		}else {
			return false;
		}
	}
	
}