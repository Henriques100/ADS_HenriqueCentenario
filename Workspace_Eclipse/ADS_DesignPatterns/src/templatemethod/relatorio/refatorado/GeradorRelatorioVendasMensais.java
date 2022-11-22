<<<<<<< HEAD
package templatemethod.relatorio.refatorado;

import java.util.List;

import templatemethod.relatorio.intro.ServicoDeRelatorio;

public class GeradorRelatorioVendasMensais extends GeradorRelatorioTemplate
{
	private Integer ano;
	private Integer mes;
	
	

	public GeradorRelatorioVendasMensais(Integer ano, Integer mes) 
	{
		this.ano = ano;
		this.mes = mes;
	}



	@Override
	public List<String> getConteudo() 
	{
		List<String> vendasMensal = ServicoDeRelatorio.getInstance().getVendasMensal(ano, mes);
		return vendasMensal;
	}

}
=======
package templatemethod.relatorio.refatorado;

import java.util.List;

import templatemethod.relatorio.intro.ServicoDeRelatorio;

public class GeradorRelatorioVendasMensais extends GeradorRelatorioTemplate
{
	private Integer ano;
	private Integer mes;
	
	

	public GeradorRelatorioVendasMensais(Integer ano, Integer mes) 
	{
		this.ano = ano;
		this.mes = mes;
	}



	@Override
	public List<String> getConteudo() 
	{
		List<String> vendasMensal = ServicoDeRelatorio.getInstance().getVendasMensal(ano, mes);
		return vendasMensal;
	}

}
>>>>>>> 8a3526c26622fc2f070fbcdff95008fb8820a218
