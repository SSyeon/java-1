package kr.hs.emirim.practice;

public class 영화배우 extends 연예인 implements 영화배우인터페이스 {
	String 대표영화;
	public void 울기() {
		System.out.println(실명+":"+"울기");
	}
	public void 개인기하기() {
		System.out.println(실명+":"+"개인기하기");
	}
}
