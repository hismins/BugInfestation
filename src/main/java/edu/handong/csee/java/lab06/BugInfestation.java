package edu.handong.csee.java.lab06;
import java.util.Scanner;
public class BugInfestation {

	final double GROWTH_RATE = 0.95;
	final double ONE_BUG_VOLUME = 0.002;

	public static void main(String[] args) {


		BugInfestation myBugInfestation= new BugInfestation();
		myBugInfestation.computeNumberOfBugsToUseFKiller();
	}	
}	