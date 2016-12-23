
public class MecanicaDoJogoDificil implements MecanicaDoJogo {

	protected Integer IdTipoJogo;
	
	public MecanicaDoJogoDificil(Integer CodigoTipoJogo) {
		this.IdTipoJogo = CodigoTipoJogo;
	}
	
	@Override
	public String getInstrucaoJogo() {
		Mensagens msg = new Mensagens();
		
		msg.setMensagens("Instrucao de Jogo", 
				"-----------------------", 
				"Nivel de Dificuldade: Dificil", 
				"Selecao de palavras com mais de 7 (sete) letras", 
				"Considerar palavras com letras Maiusculas", 
				"Considerar palavras com letras Minusculas", 
				"Considerar palavras com a Primeira letra Maiusculas e as demais letras Minusculas", 
				"Exemplos de palavras: Exemplo, exemplo, EXEMPLO",
				"Quantidade de Tentativas: 3 (tres)", 
				"Digitar SAIR para encerrar o jogo",
				"*** Boa Sorte!!! ***");
		return msg.getMensagem();
	}
	
	@Override
	public String getDificuldadeJogo(){
		return "Dificil";
	}
	
	@Override
	public Integer getQuantidadeTentativosJogo(){
		return 3;
	}
	
	
	
}
