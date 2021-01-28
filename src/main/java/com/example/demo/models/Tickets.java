package com.example.demo.models;

public class Tickets {
	
	private int idticket;
	private int idventa;
	private int numserie;
	private String cantidad;
	private String precio;
	
	public int getIdticket() {
		return idticket;
	}
	public void setIdticket(int idticket) {
		this.idticket = idticket;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getNumserie() {
		return numserie;
	}
	public void setNumserie(int numserie) {
		this.numserie = numserie;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Tickets(int idticket, int idventa, int numserie, String cantidad, String precio) {
		super();
		this.idticket = idticket;
		this.idventa = idventa;
		this.numserie = numserie;
		this.cantidad = cantidad;
		this.precio = precio;
	}

}
