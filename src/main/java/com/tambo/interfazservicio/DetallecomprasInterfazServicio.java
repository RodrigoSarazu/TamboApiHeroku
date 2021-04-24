package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;

import com.tambo.modelos.DetalleCompras;

public interface DetallecomprasInterfazServicio {
	
	public List<DetalleCompras>listar();
	public Optional<DetalleCompras>listarId(int d);
	public int save(DetalleCompras p);
	public void delete (int iddetcomp);

}
