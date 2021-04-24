package com.tambo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "detalleventas")
public class DetalleVentas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddv;
	@JoinColumn(name = "idven")
	private int idven;
	@JoinColumn(name = "idpro")
	private int idpro;
	@Column (name="precio")
	private double precio;
	@Column (name="cantidad", length= 5)
	private int cantidad;
	
	public DetalleVentas() {
		super();
	}

	public DetalleVentas(int iddv, int idven, int idpro, double precio, int cantidad) {
		super();
		this.iddv = iddv;
		this.idven = idven;
		this.idpro = idpro;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getIddv() {
		return iddv;
	}

	public void setIddv(int iddv) {
		this.iddv = iddv;
	}

	public int getIdven() {
		return idven;
	}

	public void setIdven(int idven) {
		this.idven = idven;
	}

	public int getIdpro() {
		return idpro;
	}

	public void setIdpro(int idpro) {
		this.idpro = idpro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
}
