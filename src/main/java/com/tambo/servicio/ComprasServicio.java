package com.tambo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tambo.interfaces.ComprasInterface;
import com.tambo.interfazservicio.ComprasInterfazServicio;
import com.tambo.modelos.Compras;

public class ComprasServicio implements ComprasInterfazServicio{
	
	@Autowired
	private ComprasInterface data;

	@Override
	public List<Compras> listar() {
		return (List<Compras>)data.findAll();
	}

	@Override
	public Optional<Compras> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(Compras p) {
		int res = 0;
		Compras compras = data.save(p);
		if (!compras.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int idcomp) {
		data.deleteById(idcomp);
	}

}
