import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {

	public static void main(String[] args) {
		//파일읽게 연결하자
		FileReader fr;
		try {
			fr = new FileReader("src/dataw.txt");
			//버퍼읽게 연결하자
			BufferedReader br = new BufferedReader(fr);
			//한줄읽자
			String s;
			while((s = br.readLine()) != null) {
				//화면에 출력하자
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}






