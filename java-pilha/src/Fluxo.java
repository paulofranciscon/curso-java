
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fim main");
	}
	
	private static void metodo1() {
		System.out.println("ini metodo1");
		metodo2();
		System.out.println("fim metodo2");
	}
	
	private static void metodo2() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				int a = i / 0;
			} catch (ArithmeticException ex) {
				System.out.println("ArithmeticException 01");
			}
			
					
		}
		System.out.println("Fim metodo2");
	}
	
}
