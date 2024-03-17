package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	private ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

    public Anfibio( String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
    
	public Anfibio() {
		this(null,0,null,null,null,false);
	}

	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		colorPiel="rojo";
		venenoso = true;
		setHabitat("selva");
		ranas++;
		
	}
	
	public void crearSalamandra(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		colorPiel="negro y amarillo";
		venenoso = false;
		setHabitat("selva");
		salamandras++;	
	}
	
	public int cantidadAnfibios() {
		int x = 0;
		x = ranas + salamandras;
		return x;
	}

	public ArrayList<Anfibio> getListado() {
		return listado;
	}


	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
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
    
}