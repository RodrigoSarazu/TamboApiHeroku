package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;
import com.tambo.modelos.Ventas;

public interface VentasInterfazServicio {
	
	public List<Ventas>listar();
	public Optional<Ventas>listarId(int d);
	public int save(Ventas p);
	public void delete (int idven);

}
