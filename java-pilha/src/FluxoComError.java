
public class FluxoComError {
	
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception :" + msg);
			ex.getStackTrace();
		}
		System.out.println("Fim main");
	}
	
	private static void metodo1() {
		System.out.println("ini metodo1");
		metodo2();
		System.out.println("fim metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Ini metodo2");
		metodo2();
		System.out.println("Fim metodo2");
	}
	
}
