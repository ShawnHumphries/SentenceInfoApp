import java.util.Scanner;

public class SentenceInfoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Display welcome message
		System.out.println("Welcome to the Sentence Info Application!\n");
		
		String sentence = Validator.getString(sc, "Please enter a sentence: ");
		
		String[] words = sentence.split(" ");
		System.out.println(words.length + " is the number of words in the sentence.");
		
		int count = 0;
		String[] vowels = {"a","e","i","o","u"};
		for(int i = 0; i< vowels.length;i++){
			for (int j=0; j < words.length;j++){
				for(int z=0; z < words[j].length();z++){
					char x = words[j].charAt(z);
						if(Character.toString(x).equalsIgnoreCase(vowels[i]))
							count++;
				}
			}
		}
		
		System.out.println(count+" is the number of vowels in the sentence.");
		System.out.println(sentence.length()+ " is the number of characters in the sentence.");
		
		System.out.println("\nGoodbye!");
	}

}
