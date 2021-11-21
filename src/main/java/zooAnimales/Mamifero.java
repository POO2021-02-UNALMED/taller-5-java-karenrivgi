package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		Mamifero.getListado().add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		Mamifero.getListado().add(this);
	}

	public int cantidadMamiferos() {
		return Mamifero.getListado().size();
	}
	
	public static Mamifero crearCaballo(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Mamifero caballo = new Mamifero(nombre_nuevo, edad_nueva, "pradera", genero_nuevo, true, 4 );
		Mamifero.caballos++;
		return caballo;	
		
	}

	public static Mamifero crearLeon(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Mamifero leon = new Mamifero(nombre_nuevo, edad_nueva, "selva", genero_nuevo, true, 4 );
		Mamifero.leones++;
		return leon;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> lista) {
		listado = lista;
	}

	
}
