import java.util.Scanner;

public class SentenceInfoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Display welcome message
		System.out.println("Welcome to the Sentence Info Application!\n");
		
		String sentence = Validator.getString(sc, "Please enter a sentence: ");
		
		System.out.println("\nGoodbye!");
	}

}
