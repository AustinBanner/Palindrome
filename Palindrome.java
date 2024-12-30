import java.util.Scanner;
/**
 * Checking to see if a string is a palindrome. Reads in the string
 * from the user and calls a recursive method to check the string. 
 * 
 * @author Austin Banner
 * 4/30/23
 *
 */
public class Palindrome {

	/**
	 * Checks if a string is a palindrome. Checks each outer letter
	 * first, then creates a new string with the ends cut off, then
	 * checks those, etc. Until the string is 0 or 1 letters left.
	 * @param word - String being checked.
	 * @return true or false if the string is a palindrome.
	 */
	private static boolean isPalindrome(String word) {
		boolean palindrome = false;
		// Sets the string to all lower-case.
		word = word.toLowerCase();
		// If the string is left with 0 or 1 letters, it passes as
		// a palindrome.
		if(word.length() == 0 || word.length() == 1) {
			palindrome = true;
		// If the ends of the string match, creates a new string
		// with the ends off, and recalls the method to check the new ends.
		} else if(word.charAt(0) == word.charAt(word.length() -1)) {
			String newWord = word.substring(1, word.length()-1);
			return isPalindrome(newWord);
		} 
		return palindrome;
	}
	
	
	/**
	 * Reads in the string and calls palindrome method.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What would you like to check is a palindrome? ");
		String word = keyboard.nextLine();
		
		// Print whether the string is a palindrome or not.
		if(isPalindrome(word)) {
			System.out.println(word + " is a palindrome.");
		} else if (!isPalindrome(word)) {
			System.out.println(word + " is not a palindrome.");
		}
		
		// Close the scanner.
		keyboard.close();
	}

}
