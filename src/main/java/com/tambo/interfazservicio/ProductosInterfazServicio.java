package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;
import com.tambo.modelos.Productos;

public interface ProductosInterfazServicio {
	
	public List<Productos>listar();
	public Optional<Productos>listarId(int d);
	public int save(Productos p);
	public void delete (int idpro);

}
