import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		boolean multiply = false;
		int oldNumber = 0;
		int printNumber = 0;
		
		if(number > 2) {
			for(int i = 0; i < number; i++) {
				if(i > 2) {
					if(!multiply) {
						multiply = !multiply;
						printNumber += 2;
					
					}else if(i == 4) {
						oldNumber = printNumber;
						printNumber += 2;
					}
					else {
						multiply = !multiply;
						oldNumber *= 2;	
						printNumber = oldNumber;
					}
					System.out.println(printNumber);
				}
				else {
					printNumber += 2;
				}
			}
		}
		scanner.close();
	}
}
