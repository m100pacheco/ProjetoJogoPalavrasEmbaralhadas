
public class FabricaMecanicaDoJogo {

	protected Integer IDSelecaoDificuldadeJogo;
	private Integer QuantidadeTentativosJogo;
	
	private Integer SelecaoDificuldadeJogo(){
		AplicativosGerais apg = new AplicativosGerais();
		return apg.rand(1, 4);
	}
	
	public Integer getIDSelecaoDificuldadeJogo(){
		return IDSelecaoDificuldadeJogo;
	}
	
	public Integer getQuantidadeTentativosJogo(){
		return QuantidadeTentativosJogo;
	}
	
	public void ExecutaMecanicaDoJogo(){
		
		IDSelecaoDificuldadeJogo = this.SelecaoDificuldadeJogo();
		//System.out.println("SelecaoDificuldadeJogo: " + IDSelecaoDificuldadeJogo);
		
		MecanicaDoJogo mdj = null;
		if (IDSelecaoDificuldadeJogo == 1 ){
			mdj = new MecanicaDoJogoFacil(1);
			QuantidadeTentativosJogo = mdj.getQuantidadeTentativosJogo();
			//System.out.println("Dificuldade: " + mdj.getDificuldadeJogo());
			//System.out.println("Tentativas: " + mdj.getQuantidadeTentativosJogo());
			System.out.println("Instrucao: " + mdj.getInstrucaoJogo());
			
		}
		if (IDSelecaoDificuldadeJogo == 2 ){
			mdj = new MecanicaDoJogoMedio(2);
			QuantidadeTentativosJogo = mdj.getQuantidadeTentativosJogo();
			//System.out.println("Dificuldade: " + mdj.getDificuldadeJogo());
			//System.out.println("Tentativas: " + mdj.getQuantidadeTentativosJogo());
			System.out.println("Instrucao: " + mdj.getInstrucaoJogo());
			
		}
		if (IDSelecaoDificuldadeJogo == 3 ){
			mdj = new MecanicaDoJogoDificil(3);
			QuantidadeTentativosJogo = mdj.getQuantidadeTentativosJogo();
			//System.out.println("Dificuldade: " + mdj.getDificuldadeJogo());
			//System.out.println("Tentativas: " + mdj.getQuantidadeTentativosJogo());
			System.out.println("Instrucao: " + mdj.getInstrucaoJogo());
			
		}
		if (IDSelecaoDificuldadeJogo == 4 ){
			mdj = new MecanicaDoJogoMuitoDificil(4);
			QuantidadeTentativosJogo = mdj.getQuantidadeTentativosJogo();
			//System.out.println("Dificuldade: " + mdj.getDificuldadeJogo());
			//System.out.println("Tentativas: " + mdj.getQuantidadeTentativosJogo());
			System.out.println("Instrucao: " + mdj.getInstrucaoJogo());			
		}
	}
}
