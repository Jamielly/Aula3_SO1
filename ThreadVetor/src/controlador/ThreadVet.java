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
}}
				public void concatenaPar(){
					double tempoInicial = System.nanoTime();
				double tempoFinal = System.nanoTime();
				double tempoTotal = tempoFinal - tempoInicial;
			// tempo total nS - 10^-95
				tempoTotal = tempoTotal / Math.pow(10, 9);
				System.out.println("PAR [1000] ===>" + tempoTotal + "S");
				}
			private void foreach(Class<Integer> class1) {
				//concatena de 1000 posicoes 
			public void concatenaImpar() {
			foreach (ThreadVet = 0; ThreadVet < 1000; ThreadVet++){
					double tempoFinal = System.nanoTime();
					double tempoTotal = tempoFinal - tempoInicial;
				// tempo total nS - 10^-95
					tempoTotal = tempoTotal / Math.pow(10, 9);
					System.out.println("IMPAR [1000] ===>" + tempoTotal + "S");
			}
}
}
