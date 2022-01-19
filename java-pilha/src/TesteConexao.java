
public class TesteConexao {
	
	public static void main(String[] args) {
		
		// metodo Autocloseable automaticamente implementa o metodo para fechar a conexao.
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex){
			System.out.println("Erro na conex�o");
		}

		
		//------------------------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.close();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro conex�o" + ex);
//		} finally { //Fechando conexao com ou sem erro. Sempre usar o bloco especial finally.
//			con.close();
//		}

	}
	
}
