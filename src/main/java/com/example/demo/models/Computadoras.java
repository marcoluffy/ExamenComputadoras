package com.example.demo.models;

public class Computadoras {
	
	private int numserie;
	private String marca;
	private String procesador;
	private String sistema;
	private String ram;
	private int numnucleos;
	
	public int getNumserie() {
		return numserie;
	}
	public void setNumserie(int numserie) {
		this.numserie = numserie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public int getNumnucleos() {
		return numnucleos;
	}
	public void setNumnucleos(int numnucleos) {
		this.numnucleos = numnucleos;
	}
	public Computadoras(int numserie, String marca, String procesador, String sistema, String ram, int numnucleos) {
		super();
		this.numserie = numserie;
		this.marca = marca;
		this.procesador = procesador;
		this.sistema = sistema;
		this.ram = ram;
		this.numnucleos = numnucleos;
	}

}
