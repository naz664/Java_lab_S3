import java.util.Scanner;


public class Palindrome{

	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		String rev = "";
	
		for (int i = str.length() - 1 ; i >= 0 ; i--){
			rev = rev + str.charAt(i);}
	
	
		if (rev.equalsIgnoreCase(str))
			System.out.println("Palindrome");
		
		else System.out.println("Not a Palindrome");
	
		scan.close();
		
	}	
		
}
