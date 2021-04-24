package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;

import com.tambo.modelos.Compras;

public interface ComprasInterfazServicio {
	
	public List<Compras>listar();
	public Optional<Compras>listarId(int d);
	public int save(Compras p);
	public void delete (int idcomp);

}
