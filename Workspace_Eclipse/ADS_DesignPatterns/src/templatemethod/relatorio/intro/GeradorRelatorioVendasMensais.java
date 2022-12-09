package templatemethod.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasMensais extends GeradorRelatorioTemplate
{
  public String getCabecalho()
  {
	  String cabecalho = "Empresa My" + '\n'
                                 + "--------";
	  return cabecalho;
  }
 
  
  public List<String> getConteudo(Integer ano, Integer mes)
  {
	List<String> vendasMensal = ServicoDeRelatorio.getInstance().getVendasMensal(ano, mes);
	return vendasMensal;
  }
  
  
  public String getRodape()
  {
	  String rodape = "---------------------------------------" + '\n'
                      + "* Propriedade particular - Uso confidencial";
	  return rodape;
  }
 
  
  public String criarPagina(Integer ano, Integer mes)
  {
	  String cabecalho = getCabecalho();
	  List<String> conteudo = getConteudo(ano,mes);
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


  private Integer ano;
  
  private Integer mes;
  
  


@Override
public List<String> getConteudo() {
	List<String> vendasMensal = ServicoDeRelatorio.getInstance().getVendasMensal(ano, mes);
	
	return vendasMensal;
}
}
