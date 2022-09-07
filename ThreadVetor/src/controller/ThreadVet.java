package controller;

public class ThreadVet extends Thread{
	
	public static void main(String[] args) {
	}
		@Override
		public void run() {
			for (int ThreadVet = 0; ThreadVet < 5; ThreadVet++) {
				System.out.println(ThreadVet);
				Thread threadvet = new ThreadVet();
				threadvet.start();
				// TODO Auto-generated method stub
				super.run();
			}
		}
}