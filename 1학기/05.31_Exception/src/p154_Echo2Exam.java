import java.io.IOException;
import java.io.InputStream;

public class p154_Echo2Exam {
	public static void main(String[] args) {
		InputStream is = System.in;
		while(true) {
			int i;
			try {
				i = is.read();
				if(i == -1) {
					break;
				}
				System.out.println((char)i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
