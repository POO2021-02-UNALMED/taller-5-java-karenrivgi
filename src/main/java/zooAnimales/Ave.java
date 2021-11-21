package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.setColorPlumas(colorPlumas);
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Ave halcon = new Ave(nombre_nuevo, edad_nueva, "montanas", genero_nuevo, "cafe glorioso");
		halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Ave aguila = new Ave(nombre_nuevo, edad_nueva, "montanas", genero_nuevo, "blanco y amarillo");
		aguilas++;
		return aguila;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
}
