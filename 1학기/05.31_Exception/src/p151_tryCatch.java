
public class p151_tryCatch {
	public static void main(String[] args) {
		String[] irum = new String[3];
		irum[0] = "이채린";
		irum[1] = "원채린";
		irum[2] = "서남경";
		try {
			for(int i = 0; i<=irum.length; i++) {
				System.out.println(irum[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("익셉션");
		} finally {
			System.out.println("무조건 실행합니다.");
		}
	}
}















