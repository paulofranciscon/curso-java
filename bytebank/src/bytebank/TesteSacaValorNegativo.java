package bytebank;

public class TesteSacaValorNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(900);
		System.out.println(conta.saca(500));
					
		System.out.println("Seu saldo atual: " + conta.pegaSaldo());
	}

}
