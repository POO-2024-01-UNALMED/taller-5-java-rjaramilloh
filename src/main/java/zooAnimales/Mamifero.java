package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado;
	public static int caballos =0;
	public static int leones =0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}

	public Mamifero() {
		
	}
	public void crearCaballo(String nombre, int edad, String genero ) {
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		pelaje=true;
		patas=4;
		setHabitat("pradera");
		caballos++;
		
	}
	public void crearLeon(String nombre, int edad, String genero){
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		pelaje=true;
		patas=4;
		setHabitat("selva");
		leones++;
		
	}
	
	public int cantidadMamiferos() {
		int x = 0;
		x = caballos + leones;
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