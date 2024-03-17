package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

    public Anfibio( String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}
    
	public Anfibio() {
		this(null,0,null,null,null,false);
	}

	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero, ArrayList<Zona> zona){
		Anfibio Anfibio =new Anfibio(nombre,edad, "selva",genero, "rojo", true);
		ranas++;
		return Anfibio;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero, ArrayList<Zona> zona){
		Anfibio Anfibio=new Anfibio(nombre, edad, "selva",genero, "negro y amarillo", false);
		salamandras++;	
		return Anfibio;
	}
	
	public int cantidadAnfibios() {
		int x = 0;
		x = ranas + salamandras;
		return x;
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}


	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
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