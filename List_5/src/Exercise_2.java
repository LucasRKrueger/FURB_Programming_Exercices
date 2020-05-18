import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numbers = 100;
		int sumOdd = 0, sumEven = 0;
		
		for(int i = 0; i <= numbers; i++){
			if(i % 2 == 0)
				sumEven += i;
			else
				sumOdd += i;
		}
		System.out.println("Total Odd: " + sumOdd + " \nTotal Even: " + sumEven);
			
		scanner.close();
	}
}
