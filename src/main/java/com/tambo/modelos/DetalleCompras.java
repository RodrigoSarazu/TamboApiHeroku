package com.tambo.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "detallecompras")
public class DetalleCompras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddetcomp;
	@JoinColumn(name = "idcomp")
	private int idcomp;
	@JoinColumn(name = "idpro")
	private int idpro;
	
	public DetalleCompras() {
		super();
	}

	public DetalleCompras(int iddetcomp, int idcomp, int idpro) {
		super();
		this.iddetcomp = iddetcomp;
		this.idcomp = idcomp;
		this.idpro = idpro;
	}

	public int getIddetcomp() {
		return iddetcomp;
	}

	public void setIddetcomp(int iddetcomp) {
		this.iddetcomp = iddetcomp;
	}

	public int getIdcomp() {
		return idcomp;
	}

	public void setIdcomp(int idcomp) {
		this.idcomp = idcomp;
	}

	public int getIdpro() {
		return idpro;
	}

	public void setIdpro(int idpro) {
		this.idpro = idpro;
	}
			
}
