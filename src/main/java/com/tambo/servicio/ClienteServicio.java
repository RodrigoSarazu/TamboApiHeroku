package com.tambo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tambo.interfaces.ClienteInterface;
import com.tambo.interfazservicio.ClienteInterfazServicio;
import com.tambo.modelos.Cliente;

public class ClienteServicio implements ClienteInterfazServicio{

	@Autowired
	private ClienteInterface data;
	
	@Override
	public List<Cliente> listar() {
		return (List<Cliente>)data.findAll();
	}

	@Override
	public Optional<Cliente> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(Cliente p) {
		int res = 0;
		Cliente cliente = data.save(p);
		if (!cliente.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int idcli) {
		data.deleteById(idcli);
		
	}

}
