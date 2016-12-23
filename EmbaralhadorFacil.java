import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorFacil implements Embaralhador {

	protected String Palavra;
	
	public EmbaralhadorFacil(String palavra) {
		this.Palavra = palavra;
	}
	
	@Override
	public String EmbaralharPalavras(String palavra){
		
		List<String> cadaLetra;		
		StringBuilder palavraEmbaralhada;

		cadaLetra = Arrays.asList(palavra.trim().split(""));		
		Collections.reverse(cadaLetra);
		palavraEmbaralhada = new StringBuilder();				

		for(String p : cadaLetra){	
			palavraEmbaralhada.append(p.toUpperCase());
		}				

		return palavraEmbaralhada.toString();
	}
	
	@Override	
	public int Pontuacao() {		
		return 1;
	}



}
