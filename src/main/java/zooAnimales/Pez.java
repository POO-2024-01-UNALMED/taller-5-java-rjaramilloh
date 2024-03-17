package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	private ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}

	public Pez() {
		this(null,0,null,null,null,0);
	}

	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		colorEscamas="rojo";
		cantidadAletas = 6;
		setHabitat("oceano");
		salmones++;
		
	}
	
	public void crearBacalao(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		colorEscamas="gris";
		cantidadAletas = 6;
		setHabitat("oceano");
		bacalaos++;	
	}
	
	public int cantidadPeces() {
		int x = 0;
		x = salmones +bacalaos;
		return x;
	}
	
	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
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
	
}