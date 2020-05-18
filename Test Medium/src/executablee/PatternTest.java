package executablee;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<testCases; i++){
			String pattern = in.nextLine();
          	//Write your code
try {
        Pattern pat = Pattern.compile(pattern);
        System.out.println("Valid");
        }catch(PatternSyntaxException p) {
            System.out.println("Invalid");
        }
//testCases-=1;
		}
		
	}
}