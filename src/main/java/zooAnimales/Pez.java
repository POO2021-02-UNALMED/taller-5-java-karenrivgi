package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		listado.add(this);
	}

	public static int cantidadpeces() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Pez salmon = new Pez(nombre_nuevo, edad_nueva, "oceano", genero_nuevo, "rojo", 6);
		salmones++;
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Pez bacalao = new Pez(nombre_nuevo, edad_nueva, "oceano", genero_nuevo, "gris", 6);
		bacalaos++;
		return bacalao;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
}
