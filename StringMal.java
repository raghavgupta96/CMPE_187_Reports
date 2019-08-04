

import java.util.Scanner;
import java.util.Stack;

public class StringMal {
	public static void main(String[] args){
		boolean repeat = false;
		do{
		//User Input
		System.out.println("Enter any word/phrase");
		Scanner scan = new Scanner(System.in);
		String next = scan.nextLine();
		System.out.println("Palindrome: " + stringflip(next) + "\nWord count: " + next.length());
		System.out.println("Do you want to repeat? Y/N");
		//Repeat the program until user want to end
		if(scan.next().toUpperCase().equals("N"))
			repeat = true;
		}while(repeat == false);
	}
	/**
	 * Method to check if the word/phrase is palindrome
	 * @param flip String check word/phrase
	 * @return boolean True if the word is palindrome, false otherwise
	 */
	public static boolean stringflip(String flip){
		Stack stack = new Stack();
		String result = "";
		//push String to stack, using stack characteristic first in last out to reverse the String
		for (char j : flip.trim().toCharArray()){
			stack.push(j);
		}
		//pop String from stack and compare
		while (!stack.empty()){
			result = result + stack.pop().toString();
		}
		if(flip.equals(result)){
			return true;
		}
		return false;
	}

}
