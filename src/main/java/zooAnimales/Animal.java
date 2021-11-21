package zooAnimales;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	

	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		totalAnimales++;
	}

	public String movimiento() {
		return "desplazarse";
		
	}
	
	public static String totalPorTipo(){
	
		return "Mamiferos: " + Mamifero.cantidadMamiferos()+
				"\nAves: " + Ave.cantidadAves() +
				"\nReptiles: " + Reptil.cantidadReptiles()+ 
				"\nPeces: " + Pez.cantidadpeces() +
				"\nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		
		if (getZona() != null) {
			return "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat() + " y mi genero es " + 
					getGenero() + ", la zona en la que me ubico es " + zona + ", en el " + zona.getZoo();
		}else {
			return "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat() + " y mi genero es " + 
					getGenero();
		}
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
