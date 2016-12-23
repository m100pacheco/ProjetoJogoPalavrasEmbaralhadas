
public class MecanicaDoJogoMuitoDificil implements MecanicaDoJogo {

	protected Integer IdTipoJogo;
	
	public MecanicaDoJogoMuitoDificil(Integer CodigoTipoJogo) {
		this.IdTipoJogo = CodigoTipoJogo;
	}
	
	@Override
	public String getInstrucaoJogo() {
		Mensagens msg = new Mensagens();
		
		msg.setMensagens("Instrucao de Jogo", 
				"-----------------------", 
				"Nivel de Dificuldade: Muito Dificil", 
				"Selecao de palavras com Qualquer Quantidade de Letras", 
				"Considerar palavras com letras Maiusculas", 
				"Considerar palavras com letras Minusculas", 
				"Considerar palavras onde a posicao da letra Maiuscula e Minusculas estejam conforme o Esperado pelo Jogo", 
				"Exemplos de palavras: @x@mPL&",
				"Quantidade de Tentativas: 1 (uma)",  
				"Digitar SAIR para encerrar o jogo",
				"*** Boa Sorte!!! ***");
		return msg.getMensagem();
	}
	
	@Override
	public String getDificuldadeJogo(){
		return "Muito Dificil";
	}
	
	@Override
	public Integer getQuantidadeTentativosJogo(){
		return 1;
	}

}
