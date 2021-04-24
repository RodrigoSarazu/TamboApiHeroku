package com.tambo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcli;
	@Column (name="nombre", length= 40)
	private String nombre;
	@Column (name="apellido", length= 40)
	private String apellido;
	@Column (name="dni", length= 8)
	private int dni;
	@Column (name="direccion", length= 60)
	private String direccion;
	
	public Cliente() {
		super();
	}

	public Cliente(int idcli, String nombre, String apellido, int dni, String direccion) {
		super();
		this.idcli = idcli;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
	}

	public int getIdcli() {
		return idcli;
	}

	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
