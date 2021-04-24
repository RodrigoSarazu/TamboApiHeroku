package com.tambo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tambo.modelos.Ticket;

@Repository
public interface TicketInterface extends CrudRepository<Ticket, Integer>{
	
}
