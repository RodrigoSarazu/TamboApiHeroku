package com.tambo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.tambo.interfaces.UsuarioInterface;
import com.tambo.interfazservicio.UsuarioInterfazServicio;
import com.tambo.modelos.Usuario;

public class UsuarioServicio implements UsuarioInterfazServicio{

	@Autowired
	private UsuarioInterface data;
	
	@Override
	public List<Usuario> listar() {
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(Usuario p) {
		int res = 0;
		Usuario usuario = data.save(p);
		if (!usuario.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int idusu) {
		data.deleteById(idusu);
	}

}
