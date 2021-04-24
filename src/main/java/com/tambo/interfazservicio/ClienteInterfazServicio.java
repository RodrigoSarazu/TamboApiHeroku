package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;
import com.tambo.modelos.Cliente;

public interface ClienteInterfazServicio {
	
	public List<Cliente>listar();
	public Optional<Cliente>listarId(int d);
	public int save(Cliente p);
	public void delete (int idcli);

}
