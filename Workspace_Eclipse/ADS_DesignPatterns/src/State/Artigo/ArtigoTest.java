package State.Artigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArtigoTest {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() 
	{
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		//1. rascunho > revisando
		seguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		//2. revisando > aprovado
		seguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoAprovado);
		
		System.out.println(artigo.getLogHistorico());
		
		artigo.getLogHistorico().forEach(System.out::println);
	}

	@Test
	void deveArtigoTransitarDeRascunho_Revisando_Rascunho() 
	{
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance(); 
		
		Artigo artigo = new Artigo();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		// 1. rascunho > revisando
		seguranca.setUsuarioCorrente("AUTOR");
	    artigo.publicar();
	    
	    assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		// 2. revisando > rascunho
	    seguranca.setUsuarioCorrente("MODERADOR");
	    artigo.reprovar();
	    
	    assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
	    //imprimir log
	    artigo.getLogHistorico().forEach(System.out::println);
	}
}
