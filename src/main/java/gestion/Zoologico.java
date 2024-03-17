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
	
	public Zoologico (String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
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
