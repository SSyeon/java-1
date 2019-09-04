
public class Program {
	public static void main(String[] args) {
		String str1 = "mirim";
		String str2 = "mirim";
		String str3 = new String("mirim");
		String str4 = new String("mirim");
		
		if(str1 == str2) System.out.println("주소 같다");
		else System.out.println("주소 다르다");
		if(str3 == str4) System.out.println("주소 같다");
		else System.out.println("주소 다르다");
		if(str1.equals(str2)) System.out.println("내용 같다");
		else System.out.println("내용 다르다");
		if(str3.equals(str4)) System.out.println("내용 같다");
		else System.out.println("내용 다르다");
		
		System.out.println("------------");
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
		System.out.println(String.valueOf(123));
		System.out.println("  Happy Programming! \t".trim());
		System.out.println("2320".substring(2));
		System.out.println("2320".substring(2,3));
		System.out.println("2320".charAt(1));
		System.out.println("2320".substring(1,2));
		
	}

}











