package OPF5;

public class InscripcionPorJugador {

	private TipoDeInscripcion  tipoDeInscripcion;
	private Jugador jugador;
	
	InscripcionPorJugador(TipoDeInscripcion tipoDeInscripcion, Jugador jugador, Partido partido)
	{
		this.tipoDeInscripcion= tipoDeInscripcion;
		this.jugador = jugador; 
		partido.hayNuevaInscripcion(this);
		
	}
	

}
