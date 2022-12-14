package templatemethod.relatorio.intro;

import java.util.List;

public abstract class GeradorRelatorioTemplate {

	private String getCabecalho() {
		String cabecalho = "Empresa My" + '\n';
		
		return cabecalho;
	}
	
	private String getRodape()
	{
		String rodape = "---------------------------------------------" + '\n'
	                  + "* Propriedade particular - Uso confidencial";   
		
		return rodape;
	}
	
	// este é o método template
	public abstract List<String> getConteudo();
	
	public String criarPagina()
	  {
		return null;  
	  }
	
}
