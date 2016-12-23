import java.util.Scanner;

public class Jogo {
	
	public void Jogadas(){
				
		FabricaMecanicaDoJogo fmj = new FabricaMecanicaDoJogo();		
		FabricaEmbaralhadores femb = new FabricaEmbaralhadores();
		
		fmj.ExecutaMecanicaDoJogo();
		Integer ContadorTentativas = fmj.getQuantidadeTentativosJogo();	
		femb.setSelecaoDificuldadeJogo(fmj.IDSelecaoDificuldadeJogo);
		
		Scanner inUser = new Scanner(System.in);
		Boolean flagSair = false;
		Integer Pontuacao = 0;
		Integer Tentativa = 0;
		Integer QtdeTotalContadorTentativas = ContadorTentativas;
		
		do {
			femb.ExecutaEmbaralhadora();
			Tentativa++;
			
			System.out.println("");
			
			Integer mTentativa = 0;
			if (Tentativa > QtdeTotalContadorTentativas){
				mTentativa = QtdeTotalContadorTentativas;
			} else {
				mTentativa = Tentativa;
			}
			
			System.out.println("--- Tentativa numero: " + mTentativa + " de " + QtdeTotalContadorTentativas + " ---");
			
			//System.out.println("Palavra Secreta: " + femb.getPalavra());
			//System.out.println("Palavra Embaralhada: " + femb.getPalavraEmbaralhada());
			
			System.out.println("Palavra: " + femb.getPalavraEmbaralhada());			
			System.out.println("Digite uma palavra: ");
			
			String userPalavra = inUser.nextLine();
			//System.out.println("Palavra Usuario: " + userPalavra);
						
			if (userPalavra.toUpperCase().equals("SAIR")){
				flagSair = true;
				System.out.println("");
				System.out.println("Fim de Jogo!");
				System.out.println("Pontuacao Alcancada:" + Pontuacao);
				break;
			} else {
				if (userPalavra.toUpperCase().equals(femb.getPalavra())){
					ContadorTentativas = fmj.getQuantidadeTentativosJogo();
					Pontuacao += femb.getPontuacao();
					Tentativa = 0;
					System.out.println("Acertou, Pontuacao : " + Pontuacao);
				} else {
					ContadorTentativas--;
					System.out.println("Errou, a palavra correta e: " + femb.getPalavra());
					System.out.println("Pontuacao : " + Pontuacao);
				}
			}
			
		} while ((ContadorTentativas > 0) && flagSair == false);
		inUser.close();
		
		if (ContadorTentativas == 0){
			System.out.println("");
			System.out.println("Game Over!");
			System.out.println("Pontuacao Alcancada:" + Pontuacao);
			inUser.close();
		}
	}
	
}
