package lab4;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Sisi id regex
 * 
 * @author UOrgil
 *
 */
public class SisiIdRegex {
	/**
	 * Main function
	 * 
	 * @param args
	 *            Console input string array
	 */
	public static void main(String[] args) {
		String pattern = "(\\d{2})([bBmMdD][12])((seas)|(SEAS)|(sas)|(SAS)|(sob)|(SOB)|(law)|(LAW)|(num)|(NUM))(\\d{4})";

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Сиси дугаараа оруул:");

			String sisiId = input.nextLine();

			if (Pattern.matches(pattern, sisiId)) {
				System.out.println("Сиси дугаар зөв байна.");
			} else {
				System.out.println("Сиси дугаар буруу байна.");
			}
		}
	}
}
