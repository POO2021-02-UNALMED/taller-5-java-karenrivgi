package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Anfibio extends Animal {

	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.setColorPiel(colorPiel);
		this.setVenenoso(venenoso);
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Anfibio rana = new Anfibio(nombre_nuevo, edad_nueva, "selva", genero_nuevo, "rojo", true);
		ranas++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Anfibio salamandra = new Anfibio(nombre_nuevo, edad_nueva, "selva", genero_nuevo, "negro y amarillo", false);
		salamandras++;
		return salamandra;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
}
