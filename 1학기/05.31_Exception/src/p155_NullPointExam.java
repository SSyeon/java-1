
public class p155_NullPointExam {

	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println("문자열: "+str.length());
		} catch (NullPointerException e) {
			System.out.println("불가능");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("완료");
	}
}
