package lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Word, letter counter
 * 
 * @author UOrgil
 *
 */
public class WordCounter {
	/**
	 * input
	 */
	private static Scanner input;

	/**
	 * This function is main function
	 * 
	 * @param args
	 *            String[] args
	 */
	public static void main(String[] args) {
		int lettersCount[] = new int[26];
		Arrays.fill(lettersCount, 0);

		input = new Scanner(System.in);

		System.out.println("Input text:");

		String line = input.nextLine();
		line = line.toLowerCase();

		int wordCount = 0;

		for (int i = 0; i < line.length(); i++) {
			if (Character.isLetter(line.charAt(i))) {
				lettersCount[line.charAt(i) - 'a']++;
			} else {
				for (int j = i; j < line.length(); j++) {
					if (Character.isLetter(line.charAt(j))) {
						wordCount++;
						i = j - 1;
						break;
					}
				}
			}
		}

		wordCount += Character.isLetter(line.charAt(0)) ? 1 : 0;

		System.out.println("Word count: " + wordCount);
		System.out.println("Letter count: " + Arrays.stream(lettersCount).sum());
		for (int i = 0; i < 26; i++) {
			System.out.println("\t" + (char) (i + 'a') + " - " + lettersCount[i]);
		}
	}
}
