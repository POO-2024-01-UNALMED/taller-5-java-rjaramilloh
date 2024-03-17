package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}

	public Animal() {
		
	}
	
	public String toString() {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona+", en el zoo1";
	}

	public String totalPorTipo() {
		int mamiferos = 0;
		int aves = 0;
		int reptiles = 0;
		int peces = 0;
		int anfibios = 0;
		if (nombre=="caballo" || nombre=="leon") {
			mamiferos = mamiferos+1;
		}
		else if (nombre=="halcon" || nombre=="aguila") {
			aves = aves+1;
		}
		else if (nombre=="serpiente" || nombre=="iguana") {
			reptiles = reptiles+1;
		}
		else if (nombre=="salmon" || nombre=="bacalao") {
			peces = peces+1;
		}
		else if (nombre=="rana" || nombre=="salamandra") {
			anfibios = anfibios+1;
		}
		return "Mamiferos;"+mamiferos+"/nAves:"+aves+"/nReptiles:"+reptiles+"/nPeces:"+peces+"/nAnfibios:"+anfibios;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}


	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public ArrayList<Zona> getZona() {
		return zona;
	}


	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	
	
	

}
