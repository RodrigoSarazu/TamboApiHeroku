package com.tambo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idprove;
	@Column (name="nomprov", length= 50)
	private String nomprov;
	@Column (name="nombrecontacto", length= 60)
	private String nombrecontacto;
	@Column (name="telefono", length= 9)
	private int telefono;
	@Column (name="direccionprov", length= 60)
	private String direccionprov;
	@Column (name="codpostal", length= 10)
	private String codpostal;
	
	public Proveedor() {
		super();
	}

	public Proveedor(int idprove, String nomprov, String nombrecontacto, int telefono, String direccionprov,
			String codpostal) {
		super();
		this.idprove = idprove;
		this.nomprov = nomprov;
		this.nombrecontacto = nombrecontacto;
		this.telefono = telefono;
		this.direccionprov = direccionprov;
		this.codpostal = codpostal;
	}

	public int getIdprove() {
		return idprove;
	}

	public void setIdprove(int idprove) {
		this.idprove = idprove;
	}

	public String getNomprov() {
		return nomprov;
	}

	public void setNomprov(String nomprov) {
		this.nomprov = nomprov;
	}

	public String getNombrecontacto() {
		return nombrecontacto;
	}

	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccionprov() {
		return direccionprov;
	}

	public void setDireccionprov(String direccionprov) {
		this.direccionprov = direccionprov;
	}

	public String getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}
	
		
}
