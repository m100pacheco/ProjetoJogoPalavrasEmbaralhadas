import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorDificil implements Embaralhador {

	protected String Palavra;
	
	public EmbaralhadorDificil(String palavra) {
		this.Palavra = palavra;
	}
	
	@Override
	public String EmbaralharPalavras(String palavra){
		
		List<String> cadaLetra;		
		StringBuilder palavraEmbaralhada;
		Integer rnd = 0;

		cadaLetra = Arrays.asList(palavra.trim().split(""));		
		Collections.reverse(cadaLetra);
		palavraEmbaralhada = new StringBuilder();				

		for(String p : cadaLetra){	
			AplicativosGerais apg = new AplicativosGerais();
			rnd = apg.rand(0, 1);
			if (rnd == 0) 
				palavraEmbaralhada.append(p.toUpperCase());		
			else
				palavraEmbaralhada.append(p.toLowerCase());
		}				

		return palavraEmbaralhada.toString();
	}

	@Override	
	public int Pontuacao() {		
		return 5;
	}
}
