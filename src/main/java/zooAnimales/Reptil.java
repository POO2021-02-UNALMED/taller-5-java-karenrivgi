package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		Reptil.getListado().add(this);
	}

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);
		Reptil.getListado().add(this);
	}

	public int cantidadReptiles() {
		return Reptil.getListado().size();
	}
	
	public String movimiento() {
		return "reptar";
		
	}
	
	public static Reptil crearIguana(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Reptil iguana = new Reptil(nombre_nuevo, edad_nueva, "humedal", genero_nuevo, "verde", 3);
		iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre_nuevo, int edad_nueva, String genero_nuevo) {
		Reptil serpiente = new Reptil(nombre_nuevo, edad_nueva, "jungla", genero_nuevo, "blanco", 1);
		serpientes++;
		return serpiente;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
}
