package gestion;
import java.util.*;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {
		
	}

	public Zona(String nombre, Zoologico zoo) {
		this.setNombre(nombre);
		this.setZoo(zoo);
	}

	public void agregarAnimales(Animal animal) {
		getAnimales().add(animal);
		animal.setZona(this);
	}
	
	public int cantidadAnimales() {
		return getAnimales().size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

}
