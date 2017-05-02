/**
 *   File Name: LollipopCalculatorApp.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 1, 2017
 *   
 */

package com.sqa.anayak;

import com.sqa.anayak.helpers.*;

/**
 * LollipopCalculatorApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class LollipopCalculatorApp {

	private final static String APPNAME = "LollipopCaluclator";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("In the main method of LollipopCalculator");
		String userName = AppBasics.greetUser(APPNAME);
		System.out.println(" Welcome to the " + LollipopCalculatorApp.APPNAME + " " + userName);
		addLollipops();
		AppBasics.farewellUser(userName);

	}

	/**
	 * 
	 */
	private static void addLollipops() {

		String question = " Please enter the number of children you want to give lollipops to? :";
		int numberOfChildren = AppBasics.requestInt(question);
		int totalLollipops = 0;
		int countLollipop = 0;
		for (int i = 0; i < numberOfChildren; i++) {
			countLollipop = AppBasics.requestInt("Please enter the number lollipop for child " + (i + 1) + " : ");
			totalLollipops += countLollipop;
		}
		System.out.println("The total number of lollipops requested for " + numberOfChildren + " is " + totalLollipops);
	}

}
