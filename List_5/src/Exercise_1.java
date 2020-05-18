import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numbers = 20;
		
		for(int i = 0; i <= numbers; i++) 
			if(i % 2 == 0) 
			    System.out.println(i);		
		
		scanner.close();
	}
}
