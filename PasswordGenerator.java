import java.io.*;
import java.util.*;

class PasswordGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = upperCase.toLowerCase();
		String numbers = "0123456789";
		String specialCharacters = "/<>,.|!@#$%^&*";
		String combinedChar = upperCase+lowerCase+numbers+specialCharacters;
		
		System.out.println("Reading the length of the password : ");
		int length = sc.nextInt();
		char[] password = new char[length];

		Random r = new Random();

		for (int i=0; i<length; i++) {
			password[i] = combinedChar.charAt(r.nextInt(combinedChar.length()));
		}

		System.out.println("Recommended password : "+password);

	}
}
