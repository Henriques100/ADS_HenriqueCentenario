package State.Artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artigo 
{
	private Estado estado;
	
	private List<String> logHistorico = new ArrayList<>();
	
	
	
	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public List<String> getLogHistorico() {
		return logHistorico;
	}



	public void setLogHistorico(List<String> logHistorico) {
		this.logHistorico = logHistorico;
	}



	public Artigo() 
	{
		this.estado = new EstadoRascunho(this);
	}
	
	public void publicar()
	{
		this.estado.publicar();
	}
	
	public void reprovar()
	{
		this.estado.reprovar();
	}
	
	protected void transitarParaEstado(Estado estado)
	{
		this.estado = estado;
	}
}
