<<<<<<< HEAD
package templatemethod.relatorio.refatorado;

import java.util.List;

public abstract class GeradorRelatorioTemplate 
{

	public String getCabecalho()
	  {
		  String cabecalho = "Empresa My" + '\n'
	                                 + "--------";
		  return cabecalho;
	  }
	
	//este é o metodo
	public abstract List<String> getConteudo();
	
	public String getRodape()
	  {
		  String rodape = "---------------------------------------" + '\n'
	                      + "* Propriedade particular - Uso confidencial";
		  return rodape;
	  }
	
	public String criarPagina()
	  {
		  String cabecalho = getCabecalho();
		  List<String> conteudo = getConteudo();
		  String rodape = getRodape();
		  
		  //formatação
		  StringBuffer bufferPagina = new StringBuffer();
		  bufferPagina.append(cabecalho);
		  
		  for(String linha : conteudo)
		  {
			  bufferPagina.append('\n');
			  bufferPagina.append(linha);
		  }
		  bufferPagina.append('\n');
		  
		  bufferPagina.append(rodape);
		  
		  return bufferPagina.toString();
	 }
}
=======
package templatemethod.relatorio.refatorado;

import java.util.List;

public abstract class GeradorRelatorioTemplate 
{

	public String getCabecalho()
	  {
		  String cabecalho = "Empresa My" + '\n'
	                                 + "--------";
		  return cabecalho;
	  }
	
	//este é o metodo
	public abstract List<String> getConteudo();
	
	public String getRodape()
	  {
		  String rodape = "---------------------------------------" + '\n'
	                      + "* Propriedade particular - Uso confidencial";
		  return rodape;
	  }
	
	public String criarPagina()
	  {
		  String cabecalho = getCabecalho();
		  List<String> conteudo = getConteudo();
		  String rodape = getRodape();
		  
		  //formatação
		  StringBuffer bufferPagina = new StringBuffer();
		  bufferPagina.append(cabecalho);
		  
		  for(String linha : conteudo)
		  {
			  bufferPagina.append('\n');
			  bufferPagina.append(linha);
		  }
		  bufferPagina.append('\n');
		  
		  bufferPagina.append(rodape);
		  
		  return bufferPagina.toString();
	 }
}
>>>>>>> 8a3526c26622fc2f070fbcdff95008fb8820a218
