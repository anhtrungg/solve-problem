/**
 * 
 */
package fpt.test.datastructure;

import java.util.Scanner;

/**
 * @author Nguyen Trung Anh
 *
 */

//Java program to find maximum length of word
public class LongestWord {

	// Function to find maximum length word
	static String findLongestWordInString(String input)
	{
		if(input.isEmpty())
		    	return "";
		
		String[] words = input.trim().split("\\s+");
		
		int longestWordLength = 0;
		
		String longestWord = null;
		
		for (String word : words) {
	            
				int wordLength = getLengthOfWord(word);
				
				if (longestWord == null || wordLength > longestWordLength) {
		                longestWord = word;
		                longestWordLength = wordLength;
		        }   
	    }
		
		return longestWord;
	}
	
	// Function to get length of word
	static int getLengthOfWord(String word)
	{
		if(word.isEmpty())
				return 0;
		
		return word.length();
	}
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		
		String result = findLongestWordInString(input);
		
		System.out.println(result);
	}

}
