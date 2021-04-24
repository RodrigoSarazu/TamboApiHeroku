package com.tambo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tambo.interfaces.DetallecomprasInterface;
import com.tambo.interfazservicio.DetallecomprasInterfazServicio;
import com.tambo.modelos.DetalleCompras;

public class DetallecomprasServicio implements DetallecomprasInterfazServicio{

	@Autowired
	private DetallecomprasInterface data;
	
	@Override
	public List<DetalleCompras> listar() {
		return (List<DetalleCompras>)data.findAll();
	}

	@Override
	public Optional<DetalleCompras> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(DetalleCompras p) {
		int res = 0;
		DetalleCompras detallecompras = data.save(p);
		if (!detallecompras.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int iddetcomp) {
		data.deleteById(iddetcomp);
	}

}
