package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList <Zona> zonas;
	
	public Zoologico (String nombre, String ubicacion, ArrayList <Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public Zoologico () {
		
	}
	
	public void agregarZonas(Zona zonas) {
		this.zonas.add(zonas);
	}
	
	public int cantidadTotalAnimales() {
		int cantidadTotalAnimales = 0;
		for (int i = 0;i < zonas.size();i++) {
			cantidadTotalAnimales = cantidadTotalAnimales + zonas.get(i).cantidadAnimales();
			}
		return cantidadTotalAnimales;
	}
}
