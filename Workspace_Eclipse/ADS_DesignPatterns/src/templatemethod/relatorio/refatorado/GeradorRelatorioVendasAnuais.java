package templatemethod.relatorio.refatorado;

import java.util.List;

import templatemethod.relatorio.intro.ServicoDeRelatorio;

public class GeradorRelatorioVendasAnuais extends GeradorRelatorioTemplate{

	
	private Integer ano;
	
	
	public GeradorRelatorioVendasAnuais(Integer ano) 
	{
		this.ano = ano;
	}


	@Override
	public List<String> getConteudo() 
	{
		List<String> vendasAnuais = ServicoDeRelatorio.getInstance().getVendasAnual(ano);
		return vendasAnuais;
	}

}
