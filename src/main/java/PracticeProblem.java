	/**
		* File: Lesson 3.3 - else if
		* Author: Benson
		* Date Created: March 29, 2026
		* Date Last Modified: March 29, 2026
		*/
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int numIn) {
		if (numIn == 0) {
    	return "Zero";
		} else if (numIn % 2 != 0){
    	return "Odd";
		}
		else
		return "Even";
	}

	public static String positiveOrNegative(int numIn) {
		if (numIn == 0) {
    	return "Zero";
		} else if (numIn > 0){
    	return "Positive";
		}
		else
		return "Negative";
	}
	
	public static String pluralize(String wordIn) {
		wordIn = wordIn.toLowerCase();
		if (wordIn.endsWith("ey")) {
    	return "eys";
		} else if (wordIn.endsWith("y")) {
    	return "ies";
		}
		else if (wordIn.endsWith("ife")) {
    	return "ives";
		}
		else 
		return "s";
	}

}
