package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList <Animal> animales;
	
	public Zona(String nombre,Zoologico zoo,ArrayList <Animal> animales) {
		this.nombre = nombre;
		this.zoo= zoo;
		this.animales = animales;
	}
	
	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		this.zoo= zoo;
	}
	
	
	public Zona () {
		
	}
	
	public void agrgarAnimales(Animal animales) {
		this.animales.add(animales);
	}
	
	public int cantidadAnimales () {
		int cantidadAnimales = 0;
		for (int i = 0;i < animales.size();i++) {
			cantidadAnimales=cantidadAnimales+1;
		}
		return cantidadAnimales;
	}
}
