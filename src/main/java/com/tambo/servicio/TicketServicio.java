package com.tambo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tambo.interfaces.TicketInterface;
import com.tambo.interfazservicio.TicketInterfazServicio;
import com.tambo.modelos.Ticket;

public class TicketServicio implements TicketInterfazServicio{

	@Autowired
	private TicketInterface data;
	
	@Override
	public List<Ticket> listar() {
		return (List<Ticket>)data.findAll();
	}

	@Override
	public Optional<Ticket> listarId(int d) {
		return data.findById(d);
	}

	@Override
	public int save(Ticket p) {
		int res = 0;
		Ticket ticket = data.save(p);
		if (!ticket.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int idticket) {
		data.deleteById(idticket);
	}

}
