
public class BancoDePalavras {

	private Integer IDSelecaoDificuldadeJogo;
	
	public void setIDSelecaoDificuldadeJogo(Integer idSelecaoDificuldadeJogo){
		this.IDSelecaoDificuldadeJogo = idSelecaoDificuldadeJogo;
	}
	
	public String getBancoDePalavras() {
		ManusearArquivo marq = new ManusearArquivo();
		marq.setIDSelecaoDificuldadeJogo(this.IDSelecaoDificuldadeJogo);
		marq.setNomeArquivo("C:\\Users\\marcelo\\workspace\\ProjPalavrasEmbaralhadas1\\Arquivos\\ArquivoBancoDePalavras");
		return marq.getPavalraEscolhidaArquivo();
	}
}
