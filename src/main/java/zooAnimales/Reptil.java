package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super( nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}

	public Reptil() {
		this(null,0,null,null,null,0);
	}

	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		colorEscamas="verde";
		largoCola = 3;
		setHabitat("humedal");
		iguanas++;
		
	}
	
	public void crearSerpiente(String nombre, int edad, String genero, ArrayList<Zona> zona){
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		colorEscamas="blanco";
		largoCola = 1;
		setHabitat("jungla");
		serpientes++;	
	}
	
	public int cantidadReptiles() {
		int x = 0;
		x = iguanas + serpientes;
		return x;
	}
	
	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
}