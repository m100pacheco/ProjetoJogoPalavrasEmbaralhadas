import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorMuitoDificil implements Embaralhador {

	protected String Palavra;
	
	public EmbaralhadorMuitoDificil(String palavra) {
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
		Integer NumeroLetra = 0;
		String Letra = "";
		
		AplicativosGerais apg = new AplicativosGerais();
				
		for(String p : cadaLetra){	
			
			if (p.toUpperCase().equals("A") || p.toUpperCase().equals("E") || 
					p.toUpperCase().equals("I") || p.toUpperCase().equals("O") || 
					p.toUpperCase().equals("U") ){
				Letra = trocaLetra(p.toUpperCase());
			} else {
				Letra = p;
			}
			
			NumeroLetra++;

			rnd = apg.rand(0, 1);
			if (rnd == 0) 
				palavraEmbaralhada.append(Letra.toUpperCase());		
			else
				palavraEmbaralhada.append(Letra.toLowerCase());
		}				

		return palavraEmbaralhada.toString();
	}

	@Override	
	public int Pontuacao() {		
		return 10;
	}
	
	private String trocaLetra(String Letra){
		Boolean Encontrou = false;
		String LetraTrocada = "";
		String[] VetorTrocaLetras = {"A","#","E","@","I","*","O","&","U","$"};
		
		for( int i = 0; i < VetorTrocaLetras.length; i++)
		{
		    String element = VetorTrocaLetras[i];
		    
		    if (Encontrou == true){
		    	LetraTrocada = element;
		    	break;
		    }
		    
		    if (element.equals(Letra)){
		    	Encontrou = true;
		    }
		    //System.out.println( element );    
		}
		
		return LetraTrocada;		
	}
	
}
