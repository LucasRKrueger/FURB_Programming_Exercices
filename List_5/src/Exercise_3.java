import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    double sum = 0;

        for (int counter = 1; counter <= 100; counter++) {
        	  sum += (1/ counter);
        }       
        System.out.println("Sum: " + sum);
		
		scanner.close();
	}
}
