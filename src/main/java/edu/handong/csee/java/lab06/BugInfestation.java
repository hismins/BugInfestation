package edu.handong.csee.java.lab06;
import java.util.Scanner;

public class BugInfestation {

	final double GROWTH_RATE = 0.95;
	final double ONE_BUG_VOLUME = 0.002;

	public static void main(String[] args) {


		BugInfestation myBugInfestation= new BugInfestation();
		myBugInfestation.computeNumberOfBugsToUseFKiller();
	}

	public void computeNumberOfBugsToUseFKiller() {
		Scanner keepWork = new Scanner(System.in);

		System.out.print("Enter the total volume of you house\n"
				+ "in cubic feet: ");
		double houseVolume = keepWork.nextDouble(); //volume is might double. so scan in double.
		System.out.print("Enter the estimated number of\n"
				+ " roaches in your house: ");
		int startPopulation = keepWork.nextInt();

		double population = startPopulation; 
		double totalBugVolume = population * ONE_BUG_VOLUME;

		int countWeek = 0;

		while (totalBugVolume < houseVolume) {
			double newBugs = population * GROWTH_RATE; //GROWTH_RATE is double.
			double newBugVolume = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugVolume = population * ONE_BUG_VOLUME;
			countWeek = countWeek + 1;
		}

		System.out.println("Starting with a roach population of " + startPopulation);
		System.out.println("and a houte with a volume of= " + houseVolume + " cubic feet,");
		System.out.println("after " + countWeek+ " weeks,");
		System.out.println("the house will be filled with " + (int)population + " roaches.");//print "population" in int type.
		System.out.println("They will fill a volume of " + (int)totalBugVolume +" cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
	}
}
