package com.example.demo.models;

public class Proveedores {
	
	private int idproveedor;
	private String nombrecompania;
	private String nombrecontacto;
	private String email;
	private String rfc;
	private int telefono;
	private String direccion;
	
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getNombrecompania() {
		return nombrecompania;
	}
	public void setNombrecompania(String nombrecompania) {
		this.nombrecompania = nombrecompania;
	}
	public String getNombrecontacto() {
		return nombrecontacto;
	}
	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Proveedores(int idproveedor, String nombrecompania, String nombrecontacto, String email, String rfc,
			int telefono, String direccion) {
		super();
		this.idproveedor = idproveedor;
		this.nombrecompania = nombrecompania;
		this.nombrecontacto = nombrecontacto;
		this.email = email;
		this.rfc = rfc;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	

}
