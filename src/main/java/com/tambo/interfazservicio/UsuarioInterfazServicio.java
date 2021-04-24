package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;
import com.tambo.modelos.Usuario;

public interface UsuarioInterfazServicio {
	
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int d);
	public int save(Usuario p);
	public void delete (int idusu);

}
