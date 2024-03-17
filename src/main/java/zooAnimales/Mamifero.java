package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado;
	public int caballos =0;
	public int leones =0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
			ArrayList<Mamifero> listado, int caballos, int leones, boolean pelaje, int patas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}

	public Mamifero() {
		
	}
	public void crearCaballo(String nombre, int edad, String genero, ArrayList<Zona> zona ) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		pelaje=true;
		patas=4;
		setHabitat("pradera");
		this.caballos++;
		
	}
	public void crearLeon(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		pelaje=true;
		patas=4;
		setHabitat("selva");
		this.leones++;
		
	}
	
	public int cantidadMamiferos() {
		int x = 0;
		x = this.caballos + this.leones;
		return x;
	}

	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}