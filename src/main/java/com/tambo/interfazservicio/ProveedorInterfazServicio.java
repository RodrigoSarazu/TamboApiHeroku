package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;
import com.tambo.modelos.Proveedor;

public interface ProveedorInterfazServicio {
	
	public List<Proveedor>listar();
	public Optional<Proveedor>listarId(int d);
	public int save(Proveedor p);
	public void delete (int idprove);

}
