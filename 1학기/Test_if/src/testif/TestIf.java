package testif;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		int member = 1;
		// if문으로 member가 5이면, itzy 출력
		// member가 7이면, BTS 출력
		// member가 9이면, EXO 출력
		// member가 1이면, IU 출력
		// member가 13이면, Seventeen 출력
		if (member == 5) {
			System.out.println("itzy");
		} else if (member == 7) {
			System.out.println("BTS");
		} else if (member == 9) {
			System.out.println("Exo");
		} else if (member == 1) {
			System.out.println("IU");
		} else if (member == 13) {
			System.out.println("Seventeen");
		}
		// switch문으로 바꾸자
		switch (member) {
		case 5:
			System.out.println("itzy");
			break;
		case 7:
			System.out.println("BTS");
			break;
		case 9:
			System.out.println("EXO");
			break;
		case 1:
			System.out.println("IU");
			break;
		case 13:
			System.out.println("Seventeen");
			break;

		default:
			break;
		}
		System.out.println("--------------------------");
		// 반복문
		// 구구단 2단 출력하자
		int dan = 2;
		System.out.println(dan + " x " + 1 + " = " + dan * 1);
		System.out.println(dan + " x " + 2 + " = " + dan * 2);
		System.out.println(dan + " x " + 3 + " = " + dan * 3);
		System.out.println(dan + " x " + 4 + " = " + dan * 4);
		System.out.println(dan + " x " + 5 + " = " + dan * 5);
		System.out.println(dan + " x " + 6 + " = " + dan * 6);
		System.out.println(dan + " x " + 7 + " = " + dan * 7);
		System.out.println(dan + " x " + 8 + " = " + dan * 8);
		System.out.println(dan + " x " + 9 + " = " + dan * 9);
		System.out.println("--------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
		// while문
		dan = 2;
		int i = 1;
		while (i <= 9) {
			System.out.println(dan + " x " + i + " = " + dan * i);
			i++;
		}
		System.out.println("---------------");
//		System.out.println(4);
		// for - each
		int arr[] = new int[] { 5, 7, 9, 1, 13 };
		for (int a : arr) {
			System.out.println(a + "");
			member = a;
			if (member == 5) {
				System.out.println("itzy");
			} else if (member == 7) {
				System.out.println("BTS");
			} else if (member == 9) {
				System.out.println("Exo");
			} else if (member == 1) {
				System.out.println("IU");
			} else if (member == 13) {
				System.out.println("Seventeen");
			}
		}
		System.out.println("-----------------");
		// 입력받자
		System.out.println("멤버수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		// ----
		while (true) {
			member = scanner.nextInt();
			if (member == 5) {
				System.out.println("itzy");
			} else if (member == 7) {
				System.out.println("BTS");
			} else if (member == 9) {
				System.out.println("Exo");
			} else if (member == 1) {
				System.out.println("IU");
			} else if (member == 13) {
				System.out.println("Seventeen");
			} else {
				System.out.println("탈출");
				break;
			}
		}
		// ----
		System.out.println("----");
		//번호를 입력하면, 우리반 학생 이름을 출력하자
		
	}

}








