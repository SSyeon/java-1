import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExam {

	public static void main(String[] args) {
		BufferedReader br
			= new BufferedReader(new InputStreamReader(System.in));
		String aa;
		try {
			aa = br.readLine();
			System.out.println(aa);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}









