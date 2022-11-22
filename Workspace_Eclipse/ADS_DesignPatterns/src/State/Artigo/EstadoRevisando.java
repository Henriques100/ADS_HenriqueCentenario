<<<<<<< HEAD
package State.Artigo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EstadoRevisando implements Estado{

	private Artigo artigo;
	
	
	
	public EstadoRevisando(Artigo artigo) 
	{
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		
		if(seguranca.ehUsuarioAutor()) 
		{
			this.artigo.transitarParaEstado(new EstadoAprovado(artigo));
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

		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
	
		if(seguranca.ehUsuarioModerador())
		{
			this.artigo.transitarParaEstado(new EstadoRascunho(artigo));
			this.artigo.getLogHistorico().add("Transitado para RASCUNHO em " +LocalDate.now());
			return;
		}
		else
		{
			throw new RuntimeException("Usuário não tem permissão para reprovar");
		}
			
	}
}
=======
package State.Artigo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EstadoRevisando implements Estado{

	private Artigo artigo;
	
	
	
	public EstadoRevisando(Artigo artigo) 
	{
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		
		if(seguranca.ehUsuarioAutor()) 
		{
			this.artigo.transitarParaEstado(new EstadoAprovado(artigo));
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

		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
	
		if(seguranca.ehUsuarioModerador())
		{
			this.artigo.transitarParaEstado(new EstadoRascunho(artigo));
			this.artigo.getLogHistorico().add("Transitado para RASCUNHO em " +LocalDate.now());
			return;
		}
		else
		{
			throw new RuntimeException("Usuário não tem permissão para reprovar");
		}
			
	}
}
>>>>>>> 8a3526c26622fc2f070fbcdff95008fb8820a218
