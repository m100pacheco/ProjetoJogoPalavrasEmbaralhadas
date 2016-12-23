
public class FabricaEmbaralhadores {

	protected Integer IDSelecaoDificuldadeJogo;
	private String Palavra;
	private String PalavraEmbaralhada;
	private Integer Pontuacao;

	public void setSelecaoDificuldadeJogo(Integer SelecaoDificuldadeJogo){
		this.IDSelecaoDificuldadeJogo = SelecaoDificuldadeJogo;
	}
	
	private void PalavraEmbaralhar(){
		BancoDePalavras bp = new BancoDePalavras();
		bp.setIDSelecaoDificuldadeJogo(this.IDSelecaoDificuldadeJogo);
		this.Palavra = bp.getBancoDePalavras();
	}
	
	public Integer getIDSelecaoDificuldadeJogo(){
		return IDSelecaoDificuldadeJogo;
	}
	
	public String getPalavra(){
		return Palavra;
	}
	
	public String getPalavraEmbaralhada(){
		return PalavraEmbaralhada;
	}
	
	public Integer getPontuacao(){
		return Pontuacao;
	}
	
	public void ExecutaEmbaralhadora(){
		
		PalavraEmbaralhar();
		
		//System.out.println("Selecao Dificuldade Embaraladora: " + IDSelecaoDificuldadeJogo);
		
		Embaralhador emb = null;
		if (IDSelecaoDificuldadeJogo == 1 ){
			emb = new EmbaralhadorFacil(this.Palavra);
			PalavraEmbaralhada = emb.EmbaralharPalavras(this.Palavra);
			Pontuacao = emb.Pontuacao();
			//System.out.println("Palavra: " + this.Palavra);
			//System.out.println("Palavra Embaralhada: " + PalavraEmbaralhada);			
		}
		if (IDSelecaoDificuldadeJogo == 2 ){
			emb = new EmbaralhadorMedio(this.Palavra);
			PalavraEmbaralhada = emb.EmbaralharPalavras(this.Palavra);
			Pontuacao = emb.Pontuacao();
			//System.out.println("Palavra: " + this.Palavra);
			//System.out.println("Palavra Embaralhada: " + PalavraEmbaralhada);			
		}
		if (IDSelecaoDificuldadeJogo == 3 ){
			emb = new EmbaralhadorDificil(this.Palavra);
			PalavraEmbaralhada = emb.EmbaralharPalavras(this.Palavra);
			Pontuacao = emb.Pontuacao();
			//System.out.println("Palavra: " + this.Palavra);
			//System.out.println("Palavra Embaralhada: " + PalavraEmbaralhada);
		}
		if (IDSelecaoDificuldadeJogo == 4 ){
			emb = new EmbaralhadorMuitoDificil(this.Palavra);
			PalavraEmbaralhada = emb.EmbaralharPalavras(this.Palavra);
			Pontuacao = emb.Pontuacao();
			//System.out.println("Palavra: " + this.Palavra);
			//System.out.println("Palavra Embaralhada: " + PalavraEmbaralhada);	
		}
	}
}
