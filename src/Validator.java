import java.util.Scanner;

public class Validator {
    public static String getLine(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        String s = sc.nextLine();        // read the whole line
        return s;
    }

    public static String getString(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        String s = sc.nextLine();        // read the first string on the line
        return s;
    }

    public static String getString(Scanner sc, String prompt, int length)
    {
        String s="";
        boolean isValid=false;
        while (!isValid) {
            System.out.print(prompt);
        	s = sc.next();        // read the first string on the line
        	if (s.length()==length) {
        		isValid = true;
        	}
        	else
        		System.out.println("Error! length. Should be "+length+" characters.  Try again.");
        	sc.nextLine();               // discard the rest of the line
        }
        return s;
    }

}
