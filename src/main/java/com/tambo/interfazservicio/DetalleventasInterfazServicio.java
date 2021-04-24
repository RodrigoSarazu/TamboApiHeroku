package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;
import com.tambo.modelos.DetalleVentas;

public interface DetalleventasInterfazServicio {
	
	public List<DetalleVentas>listar();
	public Optional<DetalleVentas>listarId(int d);
	public int save(DetalleVentas p);
	public void delete (int iddv);

}
