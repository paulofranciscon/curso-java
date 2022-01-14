
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println(" Ini main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("ArithmeticException -> " + msg);
			ex.printStackTrace();
		}		
		System.out.println(" Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio - metodo1");
		metodo2();
		System.out.println("Fim - metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio - metodo2");
		
		throw new MinhaExcecao("Deu mega errado! ");
//		throw new ArithmeticException("Deu muito errado!!");
//		ArithmeticException exception = new ArithmeticException("Deu muito errado!");
//		throw exception;
		
	}
}
