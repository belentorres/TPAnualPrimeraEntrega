package OPF5;

public class Jugador {
	
	private String nombre; 
	private int edad; 
	
	Jugador(String nombre, int edad)
	{
		this. nombre = nombre; 
		this. edad = edad; 
	}
	
	public void anotateComo(TipoDeInscripcion tipoDeInscripcion, Partido partido)
	{
		new InscripcionPorJugador(tipoDeInscripcion,this,partido);
	}

}
