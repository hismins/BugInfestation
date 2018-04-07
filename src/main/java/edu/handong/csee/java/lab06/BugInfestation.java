package edu.handong.csee.java.lab06;
import java.util.Scanner;

/** 
 * @author miin
 *This class and method is to compute population of roaches and their volume concerning time.
 *First enter the total volume of your house, and Enter the estimated number of roaches at now.
 *then it will compute when your house will be filled, how many roaches will live, and how much volume are roaches.
 **/

public class BugInfestation { //name of class is BugInsfestation.

	final double GROWTH_RATE = 0.95; //this variable's value won't change.
	final double ONE_BUG_VOLUME = 0.002; //this variable's value won't change.

	public static void main(String[] args) { //main method.


		BugInfestation myBugInfestation= new BugInfestation();//instantiation of class. 
		myBugInfestation.computeNumberOfBugsToUseFKiller();//instantiate with method "computeNumberOfBugsToUseFKiller()" 
	}	
	public void computeNumberOfBugsToUseFKiller() {//a method.
		Scanner keepWork = new Scanner(System.in);//from now on, this .java can read from you keyboard if you use "keepwork".

		System.out.print("Enter the total volume of your house\n" + "in cubic feet: "); //print out this massage.
		double houseVolume = keepWork.nextDouble(); //volume is might double. so scan in double.
		System.out.print("Enter the estimated number of\n" + "roaches in your house: "); //print out this massage.
		int startPopulation = keepWork.nextInt(); //population is might integer. so scan in int.

		double population = startPopulation; //declaration of double type variable "population". 
		double totalBugVolume = population * ONE_BUG_VOLUME; //declaration of double type variable "totalBugvolume".

		int countWeek = 0;//declaration of integer type variable "countWeek".

		while (totalBugVolume < houseVolume) { //condition of this loop. this loop will be executed in condition that value of "totalBugVolume" is smaller than "houseVolume". 
			double newBugs = population * GROWTH_RATE; //"GROWTH_RATE" is double. so result of computation should be double.
			double newBugVolume = newBugs * ONE_BUG_VOLUME; //"ONE_BUG_VOLUME" is double. so result of computation should be double.
			population = population + newBugs; //"population" is double type. compute and return result to "population"
			totalBugVolume = population * ONE_BUG_VOLUME; //2 variables in The right side of the equation are all double type. return result to "totalBugVolume"
			countWeek = countWeek + 1; //before go back to condition, plus 1 to "countWeek" 
		}
		System.out.println("Starting with a roach population of " + startPopulation); //print out this massage.
		System.out.println("and a houte with a volume of= " + houseVolume + " cubic feet,"); //print out this massage.
		System.out.println("after " + countWeek+ " weeks,"); //print out this massage.
		System.out.println("the house will be filled with " + (int)population + " roaches.");//print "population" in int type.
		System.out.println("They will fill a volume of " + (int)totalBugVolume +" cubic feet.");//print "totalBugVolume" in int type.
		System.out.println("Better call Debugging Experts Inc."); //print out this massage.
	}
}