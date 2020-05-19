import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfPeople = 20;
		double height = 0;
		
		for(int i = 0; i < numberOfPeople; i++) {
			System.out.println("Write ur height: ");
			height += scanner.nextDouble();
		}		
		System.out.println("Average height: " + height/numberOfPeople);
		
		scanner.close();
	}

}
