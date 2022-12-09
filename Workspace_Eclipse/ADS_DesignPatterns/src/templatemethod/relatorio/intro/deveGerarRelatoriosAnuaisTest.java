
package templatemethod.relatorio.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import templatemethod.relatorio.refatorado.GeradorRelatorioVendasAnuais;

class deveGerarRelatoriosAnuaisTest {

	@Test
	void deveGerarRelatorioVendasAnuais() 
	{
		GeradorDeRelatorioVendasAnuais gerador = new GeradorDeRelatorioVendasAnuais();
		String pagina = gerador.criarPagina(2022);
		System.out.println(pagina);
	}

}
