package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}
	
	public Ave() {
		this(null,0,null,null,null);
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		colorPlumas="cafe glorioso";
		setHabitat("montanas");
		halcones++;
		
	}
	
	public void crearAguila(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		colorPlumas="blanco y amarillo";
		setHabitat("montanas");
		aguilas++;	
	}
	
	public int cantidadAves() {
		int x = 0;
		x = halcones + aguilas;
		return x;
	}
	

	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}