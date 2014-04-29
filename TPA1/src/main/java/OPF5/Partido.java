package OPF5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Partido {
	
	private List<Jugador> jugadores;
	private String hora; 
	private String fecha; 
	private String lugar;
	
	
	Partido(String hora, String fecha, String lugar)
	 {
		jugadores= new ArrayList<Jugador>();
		this. hora = hora;
		this. fecha = fecha; 
		this. lugar = lugar; 
		
		}
	
	public boolean listaCompleta()
	{
		return jugadores.stream().filter(j->j.sosEstandar()).size();
	}
	
}
