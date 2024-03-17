package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}
	
	public Ave() {
		this(null,0,null,null,null);
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero, ArrayList<Zona> zona){
		Ave Ave=new Ave(nombre,edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return Ave;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero, ArrayList<Zona> zona){
		Ave Ave=new Ave(nombre,edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return Ave;
	}
	
	public int cantidadAves() {
		int x = 0;
		x = halcones + aguilas;
		return x;
	}
	

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}