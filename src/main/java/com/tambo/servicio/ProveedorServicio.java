package com.tambo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tambo.interfaces.ProveedorInterface;
import com.tambo.interfazservicio.ProveedorInterfazServicio;
import com.tambo.modelos.Proveedor;

public class ProveedorServicio implements ProveedorInterfazServicio{

	@Autowired
	private ProveedorInterface data;
	
	@Override
	public List<Proveedor> listar() {
		return (List<Proveedor>)data.findAll();
	}

	@Override
	public Optional<Proveedor> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(Proveedor p) {
		int res = 0;
		Proveedor proveedor = data.save(p);
		if (!proveedor.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int idprove) {
		data.deleteById(idprove);
	}

}
