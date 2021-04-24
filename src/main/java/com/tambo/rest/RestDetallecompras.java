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

import com.tambo.interfaces.DetallecomprasInterface;
import com.tambo.modelos.DetalleCompras;

@RestController
@RequestMapping("/rest_dc") 
@CrossOrigin(origins = "http://localhost:4200")
public class RestDetallecompras {
	
	@Autowired
	private DetallecomprasInterface data;
	
	@GetMapping
	public List<DetalleCompras> listar(){
		return(List<DetalleCompras>)data.findAll(); 
	}
	
	@GetMapping(value ="/{id}")
	public Optional<DetalleCompras> listarId(@PathVariable("id") Integer id) {		
		return data.findById(id);
	}
	
	
	@PostMapping
	public void insertar(@RequestBody DetalleCompras dc) {
		data.save(dc);
	}
	
	@PutMapping
	public void modificar(@RequestBody DetalleCompras dc) {
		data.save(dc);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		data.deleteById(id);
	}

}
