<<<<<<< HEAD
package templatemethod.relatorio.refatorado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorRelatorioTemplateTest_2 {

	@Test
	void deveGerarRelatorioVendasAnuaisPeloTemplate() {
	GeradorRelatorioTemplate template = new GeradorRelatorioVendasAnuais(2022);
	
	String pagina = template.criarPagina();
	
	System.out.println(pagina);
	}
	

}
=======
package templatemethod.relatorio.refatorado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorRelatorioTemplateTest_2 {

	@Test
	void deveGerarRelatorioVendasAnuaisPeloTemplate() {
	GeradorRelatorioTemplate template = new GeradorRelatorioVendasAnuais(2022);
	
	String pagina = template.criarPagina();
	
	System.out.println(pagina);
	}
	

}
>>>>>>> 8a3526c26622fc2f070fbcdff95008fb8820a218
