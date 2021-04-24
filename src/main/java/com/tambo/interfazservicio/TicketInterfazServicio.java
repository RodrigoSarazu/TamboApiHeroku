package com.tambo.interfazservicio;

import java.util.List;
import java.util.Optional;

import com.tambo.modelos.Ticket;

public interface TicketInterfazServicio {
	
	public List<Ticket>listar();
	public Optional<Ticket>listarId(int d);
	public int save(Ticket p);
	public void delete (int idticket);

}
