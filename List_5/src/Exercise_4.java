import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numbers = 20;
		double upNumber = 3.0, downNumber = 2.0;
		double sum = 0;
		
		for(int i = 0; i < numbers; i++) {
			sum += upNumber/downNumber;
			downNumber += upNumber + 1.0;
			upNumber += 2.0;
		}
		System.out.println("SUM: " + sum);
		scanner.close();
	}
	
}
