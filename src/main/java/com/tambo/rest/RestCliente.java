package com.tambo.rest;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tambo.interfaces.ClienteInterface;
import com.tambo.modelos.Cliente;

@RestController
@RequestMapping("/rest_cli") 
@CrossOrigin(origins = "http://localhost:4200")
public class RestCliente {
	
	@Autowired
	private ClienteInterface data;
	
	@GetMapping
	public List<Cliente> listar(){
		return(List<Cliente>)data.findAll();
	}
	
	@GetMapping(value ="/{id}")
	public Optional<Cliente> listarId(@PathVariable("id") Integer id) {		
		return data.findById(id);
	}
	
	
	@PostMapping
	public void insertar(@RequestBody Cliente cli) {
		data.save(cli);
	}
	
	@PutMapping
	public void modificar(@RequestBody Cliente cli) {
		data.save(cli);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		data.deleteById(id);
	}

}
