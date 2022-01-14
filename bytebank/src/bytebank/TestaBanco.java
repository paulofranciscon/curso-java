package bytebank;


public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Franciscon";
		paulo.cpf = "123123123-22";
		paulo.profissao = "Developer";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		System.out.println(contaDoPaulo.titular.nome);
	}

}
