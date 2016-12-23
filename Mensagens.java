
public class Mensagens {
	protected String Mensagem0;
	protected String Mensagem1;
	protected String Mensagem2;
	protected String Mensagem3;
	protected String Mensagem4;
	protected String Mensagem5;
	protected String Mensagem6;
	protected String Mensagem7;
	protected String Mensagem8;
	protected String Mensagem9;
	protected String Mensagem10;
	
	public void setMensagens(String mensagem0, 
			                 String mensagem1, 
			                 String mensagem2, 
			                 String mensagem3, 
			                 String mensagem4, 
			                 String mensagem5, 
			                 String mensagem6, 
			                 String mensagem7, 
			                 String mensagem8, 
			                 String mensagem9, 
			                 String mensagem10){
		this.Mensagem0 = mensagem0;
		this.Mensagem1 = mensagem1;
		this.Mensagem2 = mensagem2;
		this.Mensagem3 = mensagem3;
		this.Mensagem4 = mensagem4;
		this.Mensagem5 = mensagem5;
		this.Mensagem6 = mensagem6;
		this.Mensagem7 = mensagem7;
		this.Mensagem8 = mensagem8;
		this.Mensagem9 = mensagem9;
		this.Mensagem10 = mensagem10;
	}
	
	public String getMensagem(){
		StringBuilder msg = new StringBuilder();

		msg.append(this.Mensagem0 + "\n");
		msg.append(this.Mensagem1 + "\n");
		msg.append(this.Mensagem2 + "\n");
		msg.append(this.Mensagem3 + "\n");
		msg.append(this.Mensagem4 + "\n");
		msg.append(this.Mensagem5 + "\n");
		msg.append(this.Mensagem6 + "\n");
		msg.append(this.Mensagem7 + "\n");
		msg.append(this.Mensagem8 + "\n");
		msg.append(this.Mensagem9 + "\n");
		msg.append(this.Mensagem10 + "\n");
		
		return msg.toString();
	}
}
