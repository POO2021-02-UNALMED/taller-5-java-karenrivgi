package gestion;
import zooAnimales.Animal;
import java.util.*;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private static  ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	
	public Zoologico() {
		
	}
	
	
	public Zoologico(String nombre, String ubicacion) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
	}

	public void agregarZonas(Zona zona) {
		getZona().add(zona);
	}

	public int cantidadTotalAnimales() {
		
		int numAnimales = 0;
		
		for(int i = 0; i<getZona().size(); i++) {
			Zona zonaActual = getZona().get(i);
			List <Animal> animales = zonaActual.getAnimales();
			numAnimales += animales.size();	
			}
		
		return numAnimales;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public ArrayList<Zona> getZona() {
		return zonas;
	}


	public void setZonas(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
}
