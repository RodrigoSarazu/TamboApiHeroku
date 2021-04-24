package com.tambo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idticket;
	@JoinColumn(name = "idusu")
	private int idusu;
	@JoinColumn(name = "idven")
	private int idven;
	@Column (name="cantidad", length= 11)
	private int cantidad;
	@Column (name="fecha")
	private String fecha;
	
	public Ticket() {
		super();
	}

	public Ticket(int idticket, int idusu, int idven, int cantidad, String fecha) {
		super();
		this.idticket = idticket;
		this.idusu = idusu;
		this.idven = idven;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}

	public int getIdticket() {
		return idticket;
	}

	public void setIdticket(int idticket) {
		this.idticket = idticket;
	}

	public int getIdusu() {
		return idusu;
	}

	public void setIdusu(int idusu) {
		this.idusu = idusu;
	}

	public int getIdven() {
		return idven;
	}

	public void setIdven(int idven) {
		this.idven = idven;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	
	
}
