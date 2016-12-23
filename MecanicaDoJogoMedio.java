
public class MecanicaDoJogoMedio implements MecanicaDoJogo {

	protected Integer IdTipoJogo;
	
	public MecanicaDoJogoMedio(Integer CodigoTipoJogo) {
		this.IdTipoJogo = CodigoTipoJogo;
	}
	
	@Override
	public String getInstrucaoJogo() {
		Mensagens msg = new Mensagens();
		
		msg.setMensagens("Instrucao de Jogo", 
				"-----------------------", 
				"Nivel de Dificuldade: Medio", 
				"Selecao de palavras com 4 (quatro) a 6 (seis) letras", 
				"Considerar palavras com letras Maiusculas", 
				"Considerar palavras com letras Minusculas", 
				"Considerar palavras com a Primeira letra Maiusculas e as demais letras Minusculas", 
				"Exemplos de palavras: Exemplo, exemplo, EXEMPLO",
				"Quantidae de Tentativas: 4 (quatro)", 
				"Digitar SAIR para encerrar o jogo",
				"*** Boa Sorte!!! ***");
		return msg.getMensagem();
	}
	
	@Override
	public String getDificuldadeJogo(){
		return "Medio";
	}
	
	@Override
	public Integer getQuantidadeTentativosJogo(){
		return 4;
	}

}
