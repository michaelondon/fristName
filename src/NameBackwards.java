import java.util.Scanner;

public class NameBackwards {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String enterName=input.next();
		
		int nameCounter= enterName.length() -1;
		
		while (nameCounter >= 0) {
			System.out.println(enterName.charAt(nameCounter));
			nameCounter--;
				
	}

}
}
