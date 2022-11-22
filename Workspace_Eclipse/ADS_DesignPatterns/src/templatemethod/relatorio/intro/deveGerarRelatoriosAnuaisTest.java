<<<<<<< HEAD
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
=======
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
>>>>>>> 8a3526c26622fc2f070fbcdff95008fb8820a218
