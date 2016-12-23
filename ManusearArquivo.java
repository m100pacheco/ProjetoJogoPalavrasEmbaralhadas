import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ManusearArquivo {
	
	private Integer IDSelecaoDificuldadeJogo;
	private String NomeArquivo;
	private LineNumberReader lineRead;
	
	public void setIDSelecaoDificuldadeJogo(Integer idSelecaoDificuldadeJogo){
		this.IDSelecaoDificuldadeJogo = idSelecaoDificuldadeJogo;
	}
	
	public void setNomeArquivo(String nomeArquivo){
		this.NomeArquivo = nomeArquivo;
	}
	
	public String getPavalraEscolhidaArquivo(){		
		return PalavraSelecionadaNoArquivo();
	}

	public Integer getQuantidadeLinhasArquivo(){
		return ContarQuantidadeLinhasArquivo();
	}
	
	private Integer ContarQuantidadeLinhasArquivo(){	
		int numLinhas = 0;
		try {
			File arquivoLeitura = new File(this.NomeArquivo);
			
			long tamanhoArquivo = arquivoLeitura.length();
		    FileInputStream fs = new FileInputStream(arquivoLeitura);
            DataInputStream in = new DataInputStream(fs);

            lineRead = new LineNumberReader(new InputStreamReader(in));
		    lineRead.skip(tamanhoArquivo);
		    numLinhas = lineRead.getLineNumber() + 1;
		    //System.out.println("O ARQUIVO CONTEM " + numLinhas + " LINHAS!!!!!!!");
		    
		} catch (IOException e) {
		}
		return numLinhas;
	}
	
	
	private String PalavraSelecionadaNoArquivo() {	
		
		File arquivo1 = new File(this.NomeArquivo);
		//System.out.println(arquivo1.getAbsolutePath());
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(arquivo1.getAbsoluteFile()));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		List<String> lines = new ArrayList<String>();
	
		String line = null;
		try {
			line = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		while( line != null ) {
		    lines.add(line);
		    try {
				line = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Random r = new Random();
		boolean encontrou = false;
		String randomString = "";
		
		//System.out.println("fmj.IDSelecaoDificuldadeJogo: " + this.IDSelecaoDificuldadeJogo);
		
		do {
			randomString = lines.get(r.nextInt(lines.size()));
			
			if (this.IDSelecaoDificuldadeJogo == 1 && randomString.length() >= 2 && randomString.length() <= 3 ){
				encontrou = true;
			}
			if (this.IDSelecaoDificuldadeJogo == 2 && randomString.length() >= 4 && randomString.length() <= 6 ){
				encontrou = true;
			}
			if (this.IDSelecaoDificuldadeJogo == 3 && randomString.length() >= 7){
				encontrou = true;
			}
			if (this.IDSelecaoDificuldadeJogo == 4){
				encontrou = true;
			}
			
			//System.out.println("Palavra do arquivo: " + randomString);
		} while (!encontrou);
		return randomString.toString();	
	}

}
