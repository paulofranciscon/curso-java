
public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conex�o!");
	}
	
	public void leDados() {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}
	
	@Override
	public void close() {
		System.out.println("Fechando conex�o!");		
	}
}
