package com.tambo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class Ventas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idven;
	@Column (name="fecha")
	private String fecha;
	@Column (name="tipodocumento", length= 50)
	private String tipodocumento;
	@Column (name="numerodocumento", length= 10)
	private String numerodocumento;
	@JoinColumn(name = "idcli")
	private int idcli;
	
	public Ventas() {
		super();
	}

	public Ventas(int idven, String fecha, String tipodocumento, String numerodocumento, int idcli) {
		super();
		this.idven = idven;
		this.fecha = fecha;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.idcli = idcli;
	}

	public int getIdven() {
		return idven;
	}

	public void setIdven(int idven) {
		this.idven = idven;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public int getIdcli() {
		return idcli;
	}

	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}

	
			
}
