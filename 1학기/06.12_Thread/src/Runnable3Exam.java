class Top3 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i<30;i++) {
			System.out.print(Thread.currentThread().getName()+i+"\t");
		}
	}
}

public class Runnable3Exam {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top3 t = new Top3();
		Thread thd1 = new Thread(t, "a");	//이름: a
		Thread thd2 = new Thread(t, "b");	//이름: b
		thd1.setPriority(Thread.MAX_PRIORITY);		//10
		thd2.setPriority(Thread.MIN_PRIORITY);		//1
		thd1.start();
		thd2.start();
		System.out.println(thd1.getPriority());
		System.out.println(thd2.getPriority());
		
		System.out.println("프로그램 종료");
	}
}



















