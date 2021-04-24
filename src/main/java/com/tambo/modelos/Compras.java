package com.tambo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcomp;
	@JoinColumn(name = "idprove")
	private int idprove;
	@Column (name="descripcion", length= 100)
	private String descripcion;
	@Column (name="cantidad", length= 5)
	private int cantidad;
	
	public Compras() {
		super();
	}

	public Compras(int idcomp, int idprove, String descripcion, int cantidad) {
		super();
		this.idcomp = idcomp;
		this.idprove = idprove;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public int getIdcomp() {
		return idcomp;
	}

	public void setIdcomp(int idcomp) {
		this.idcomp = idcomp;
	}

	public int getIdprove() {
		return idprove;
	}

	public void setIdprove(int idprove) {
		this.idprove = idprove;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

		
}
