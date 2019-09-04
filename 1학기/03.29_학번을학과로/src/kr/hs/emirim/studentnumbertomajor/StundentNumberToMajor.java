package kr.hs.emirim.studentnumbertomajor;

import java.util.Scanner;

public class StundentNumberToMajor {
	public static void main(String[] args) {
		String[] 학년3 = {"인터랙티브미디어과", "인터랙티브미디어과",
				"뉴미디어디자인과", "뉴미디어디자인과", "뉴미디어솔루션과", "뉴미디어솔루션과"};
		String[] 학년2 = {"뉴미디어소프트웨어과", "뉴미디어소프트웨어과",
				"뉴미디어웹솔루션과", "뉴미디어웹솔루션과", "뉴미디어디자인과", "뉴미디어디자인과"};
		//학번을 입력받자
		Scanner scanner = new Scanner(System.in);
		String studentNumber = scanner.nextLine();
		
		//학과를 출력하자
		//0번째 글자가 3이면
		if(studentNumber.substring(0, 1).equals("3")) {
			//1,2는 인터랙티브미디어, 3,4은 뉴미디어디자인, 5,6은 뉴미디어솔루션
			String classroomStr = studentNumber.substring(1,2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(학년3[classroom]);
//			if(studentNumber.substring(1, 2).equals("1")
//					|| studentNumber.substring(1, 2).equals("2")) {
//				System.out.println("인터랙티브미디어과");
//			} else if(studentNumber.substring(1, 2).equals("3")
//					|| studentNumber.substring(1, 2).equals("4")) {
//				System.out.println("뉴미디어디자인과");
//			} else if(studentNumber.substring(1, 2).equals("5")
//					|| studentNumber.substring(1, 2).equals("6")) {
//				System.out.println("뉴미디어솔루션과");
//			}
		} else {
			//0번째 글자가 3이 아니면
			//1,2는 뉴미디어소프트웨어, 3,4은 뉴미디어웹솔루션, 5,6은 뉴미디어디자인
			String classroomStr = studentNumber.substring(1,2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(학년2[classroom]);
			
//			if(studentNumber.substring(1, 2).equals("1")
//					|| studentNumber.substring(1, 2).equals("2")) {
//				System.out.println("뉴미디어소프트웨어과");
//			} else if(studentNumber.substring(1, 2).equals("3")
//					|| studentNumber.substring(1, 2).equals("4")) {
//				System.out.println("뉴미디어웹솔루션과");
//			} else if(studentNumber.substring(1, 2).equals("5")
//					|| studentNumber.substring(1, 2).equals("6")) {
//				System.out.println("뉴미디어디자인과");
//			}
		}

	}

}











