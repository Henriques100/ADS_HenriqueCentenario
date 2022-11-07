package State.Artigo;

import java.time.LocalDate;

public class EstadoRascunho implements Estado {

	private Artigo artigo;
	
	
	public EstadoRascunho(Artigo artigo) 
	{
		this.artigo = artigo;
	}

	@Override
	public void publicar() 
	{
	GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

		if(seguranca.ehUsuarioAutor()) 
		{
			this.artigo.transitarParaEstado(new EstadoRevisando(artigo));
			this.artigo.getLogHistorico().add("Transitado para REVISANDO em " + LocalDate.now());
			return;
		}
		else
		{
			throw new RuntimeException("Usuário não tem permissão para publicar");
		}
	}

	@Override
	public void reprovar() 
	{
		// faz nada
	}

	
}
