package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class StopWatch{
	long StartTime,StopTime, Elapsed = 0;
	//Starting the watch
	public void start(){
		StartTime = System.currentTimeMillis();
	}
	//Stopping
	public void stop(){
		StopTime = System.currentTimeMillis();
	}
	//Calculating Elapsed time
	public long getElapsedTime(){
		Elapsed = (StopTime - StartTime);
		return Elapsed;
	}

	public static void main(String[] args){
		Utility u = new Utility();
		int startChoice,stopChoice;
		StopWatch w = new StopWatch();
		System.out.println("Please Choose your option:\n1. Start\n2. Stop");
		startChoice = u.inputInteger();
		w.start();
		System.out.println("Time is Started\nPlease Enter 2 for Stopping the clock: ");
		stopChoice = u.inputInteger();
		w.stop();
		System.out.println("Elapsed Time-: "+w.getElapsedTime()+" mili Seconds");
	
	}
}
