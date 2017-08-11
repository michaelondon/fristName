import java.util.Scanner;

public class FirstNameBackward {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter First Name");
		String fristName = input.next();

		int nameCounter = fristName.length() - 1;

		while (nameCounter >= 0) {
			System.out.println(fristName.charAt(nameCounter));
			nameCounter--;
		}

	}

}
