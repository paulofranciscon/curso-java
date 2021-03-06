
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (Exception ex){
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
			ex.getStackTrace(); //capturar rota recursiva do erro
		}
		System.out.println("Fim main");
	}
	
	private static void metodo1() throws MinhaExcecao{
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fim metodo1");
	}
	
	private static void metodo2() throws MinhaExcecao {
		System.out.println("Inicio metodo2");
		throw new MinhaExcecao("Simulando lanšamento erro");
	}
	
}
 