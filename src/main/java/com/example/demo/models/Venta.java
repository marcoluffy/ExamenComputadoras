package com.example.demo.models;

public class Venta {
	
	private int idventa;
	private int idusuario;
	private String fecha;
	private double  subtotal;
	private double  iva;
	private double costoEnvio;
	private double total;
	
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(double costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Venta(int idventa, int idusuario, String fecha, double subtotal, double iva, double costoEnvio,
			double total) {
		super();
		this.idventa = idventa;
		this.idusuario = idusuario;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.iva = iva;
		this.costoEnvio = costoEnvio;
		this.total = total;
	}


}
