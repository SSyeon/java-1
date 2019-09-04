package 우리반번호이름;

import java.util.Scanner;

//import java.util.Scanner;

public class 우리반번호이름 {
	public static void main(String[] args) {
		// 2-3
		// "강지민", "강혜정", "김가영", "김나영", "김선옥", "김수진", "류정민", "박교령", "서남경", "오승연", "원예린",
		// "원채린", "이서현", "이채린", "이현수", "임현진", "장원이", "장유경", "한다연"
		// 2-4
		String[] 반4 = { "강은서", "곽가연", "김민지", "김봄이", "김소현", "김채민", "남정윤", "박서연", "서혜림", "신채린", "양수빈", "엄하늘", "원채연",
				"윤수빈", "임태희", "전은정", "정유경", "함지현" };
//		for(int i = 0;i<반4.length;i++) {
//			System.out.println(반4[i]);
//		}
		for(String name:반4) {
			System.out.println(name);
		}
		
		System.out.println("번호를 입력하세요. 이름을 알려드립니다.");
		// 입력하자
		Scanner scanner = new Scanner(System.in);
		for(;;) {
		//while (true) {
			// ----
			int number = scanner.nextInt();
			//1<=number<=18
			if(1<=number && number<=반4.length) {
				// 출력하자
				System.out.println(반4[number - 1]);
			} else {
				break;
			}
			// ---
		}

//		if(number == 1) {
//			System.out.println("강지민");
//		} else if(number == 2) {
//			System.out.println("강혜정");
//		} else if(number == 3) {
//			System.out.println("김가영");
//		} else if(number == 4) {
//			System.out.println("김나영");
//		}

//		switch (number) {
//		case 1:
//			System.out.println("강지민");
//			break;
//		case 2:
//			System.out.println("강혜정");
//			break;
//		case 3:
//			System.out.println("김가영");
//			break;
//		case 4:
//			System.out.println("김나영");
//			break;
//
//		default:
//			break;
//		}

	}
}
