
public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123,456);
		
		conta.deposita(100.0);
		try {
			conta.saca(100.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
				
		System.out.println("Saldo Atual: "+conta.getSaldo());
	}
}
