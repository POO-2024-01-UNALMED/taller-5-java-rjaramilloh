package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super( nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}

	public Reptil() {
		this(null,0,null,null,null,0);
	}

	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero, ArrayList<Zona> zona){
		Reptil Reptil= new Reptil(nombre, edad, "humedal",genero, "verde",3);
		iguanas++;
		return Reptil;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero, ArrayList<Zona> zona){
		Reptil Reptil =new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return Reptil;
	}
	
	public int cantidadReptiles() {
		int x = 0;
		x = iguanas + serpientes;
		return x;
	}
	
	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
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