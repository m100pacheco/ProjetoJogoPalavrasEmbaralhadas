
public class MecanicaDoJogoFacil implements MecanicaDoJogo {

	protected Integer IdTipoJogo;
	
	public MecanicaDoJogoFacil(Integer CodigoTipoJogo) {
		this.IdTipoJogo = CodigoTipoJogo;
	}
	
	@Override
	public String getInstrucaoJogo() {
		Mensagens msg = new Mensagens();
		
		msg.setMensagens("Instrucao de Jogo", 
				"-----------------------", 
				"Nivel de Dificuldade: Facil", 
				"Selecao de palavras com 2 (duas) ou 3 (tres) letras", 
				"Considerar palavras com letras Maiusculas", 
				"Considerar palavras com letras Minusculas", 
				"Considerar palavras com a Primeira letra Maiusculas e as demais letras Minusculas",
				"Exemplos de palavras: Exemplo, exemplo, EXEMPLO", 
				"Quantidade de Tentativas: 5 (cinco)", 
				"Digitar SAIR para encerrar o jogo",
				"*** Boa Sorte!!! ***");
		return msg.getMensagem();
	}
	
	@Override
	public String getDificuldadeJogo(){
		return "Facil";
	}
	
	@Override
	public Integer getQuantidadeTentativosJogo(){
		return 5;
	}

}
