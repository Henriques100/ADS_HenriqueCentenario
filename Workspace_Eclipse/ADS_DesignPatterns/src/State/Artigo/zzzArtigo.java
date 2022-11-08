package State.Artigo;

import java.util.List;

import javax.management.RuntimeErrorException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class zzzArtigo {

	private String estado;
	
	private List<String> logHistorico = new ArrayList<>();

	public String getEstado()
	{
		return estado;
	}

	public List<String> getLogHistorico() 
	{
		return logHistorico;
	}
	
	public zzzArtigo() 
	{
		this.estado = "RASCUNHO";//estado inicial
	}
	
	public void publicar() 
	{
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
	
		if("RASCUNHO".equals(this.estado))
		{
			if(seguranca.ehUsuarioAutor()) 
			{
				this.estado = "REVISANDO";
				this.logHistorico.add("Transitado para REVISANDO em " + LocalDate.now());
				return;
			}
			else
			{
				throw new RuntimeException("Usuário não tem permissão para publicar");
			}
		}
		if("REVISANDO".equals(this.estado))
		{
			if(seguranca.ehUsuarioModerador()) 
			{
				this.estado = "APROVADO";
				this.logHistorico.add("Transitado para REVISANDO em " + LocalDate.now());
				return;
			}
			else
			{
				throw new RuntimeException("Usuário não tem permissão para publicar");
			}
		}
	}
	
	public void reprovar() 
	{
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if("REVISANDO".equals(this.estado))
		{
			if(seguranca.ehUsuarioModerador())
			{
				this.estado = "RASCUNHO";
				this.logHistorico.add("Transitado para RASCUNHO em " +LocalDateTime.now());
				return;
			}
			else
			{
				throw new RuntimeException("Usuário não tem permissão para reprovar");
			}
		}
	}
}
