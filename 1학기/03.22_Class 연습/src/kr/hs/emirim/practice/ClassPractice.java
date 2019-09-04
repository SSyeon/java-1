package kr.hs.emirim.practice;

public class ClassPractice {
	public static void main(String[] args) {
		연예인 박나래 = new 연예인();
		박나래.실명 = "박나래";
		박나래.여자인가 = true;
		박나래.방송하기();
		박나래.인터뷰하기();
		
		영화배우 박서준 = new 영화배우();
		박서준.실명 = "박서준";
		박서준.여자인가 = false;
		박서준.방송하기();
		박서준.인터뷰하기();
		박서준.대표영화 = "청년경찰";
		박서준.울기();
		박서준.개인기하기();
		
		연예인 연예인A씨 = 박서준;
		연예인A씨.방송하기();
		연예인A씨.인터뷰하기();
		연예인A씨.개인기하기();
		((영화배우)연예인A씨).울기();
		
		가수 김영철 = new 가수();
		김영철.실명 = "김영철";
		김영철.여자인가 = false;
		김영철.대표곡 = "널사랑하지않아";
		김영철.공연하기();
		김영철.개인기하기();
		
		놀기();
	}

	private static void 놀기() {
		// TODO Auto-generated method stub
		
	}
}




















