package lab4;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Person id regex
 * 
 * @author UOrgil
 *
 */
public class PersonIdRegex {
	/**
	 * Main function
	 * 
	 * @param args
	 *            Console input string array
	 */
	public static void main(String[] args) {
		// А-Яа-я - \u0410-\u044f;
		// Ё - \u0401; ё - \u0451; Ө - \u04e8; ө - \u04e9; Ү - \u04ae; ү - \u04af;
		String pattern = "([\\u0410-\\u044f\\u0401\\u0451\\u04e8\\u04e9\\u04ae\\u04af]{2})(\\d{2}(0[1-9]|[12]\\d|3[0-2])(0[1-9]|[12]\\d|3[01])\\d{2})";
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Регистрийн дугаараа оруул:");

			String personId = input.nextLine();

			if (Pattern.matches(pattern, personId)) {
				System.out.println("Регистрийн дугаар зөв байна.");
			} else {
				System.out.println("Регистрийн дугаар буруу байна.");
			}
		}
	}
}
