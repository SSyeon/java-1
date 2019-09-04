import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자:");
		int a = scan.nextInt();
		System.out.println("문자:");
		String b = scan.nextLine();
		System.out.println("숫자:");
		int c = scan.nextInt();
		
		System.out.println(a+b+c);
	}

}
