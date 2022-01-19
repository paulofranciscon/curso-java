
public class TesteConexao {
	
	public static void main(String[] args) {
		
		// metodo Autocloseable automaticamente implementa o metodo para fechar a conexao.
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex){
			System.out.println("Erro na conexão");
		}

		
		//------------------------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.close();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro conexão" + ex);
//		} finally { //Fechando conexao com ou sem erro. Sempre usar o bloco especial finally.
//			con.close();
//		}

	}
	
}
