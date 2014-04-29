package OPF5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Partido {
	
	private List<InscripcionPorJugador> inscripciones= new ArrayList<InscripcionPorJugador> ();
	private String hora; 
	private String fecha; 
	private String lugar;
	
	
	Partido(String hora, String fecha, String lugar)
	 {
		
		this. hora = hora;
		this. fecha = fecha; 
		this. lugar = lugar; 
		
		}
	
	public void hayNuevaInscripcion(InscripcionPorJugador inscripcion)
	{
		if (inscripcion.sePuedeAnotarA(this))
		{
			inscripciones.add(inscripcion);
		}
	}
	
	
	
	
}
