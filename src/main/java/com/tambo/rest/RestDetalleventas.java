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
import com.tambo.interfaces.DetalleventasInterface;
import com.tambo.modelos.DetalleVentas;

@RestController
@RequestMapping("/rest_dv") 
@CrossOrigin(origins = "http://localhost:4200")
public class RestDetalleventas {
	
	@Autowired
	private DetalleventasInterface data;
	
	@GetMapping
	public List<DetalleVentas> listar(){
		return(List<DetalleVentas>)data.findAll();
	}
	
	@GetMapping(value ="/{id}")
	public Optional<DetalleVentas> listarId(@PathVariable("id") Integer id) {		
		return data.findById(id);
	}
	
	
	@PostMapping
	public void insertar(@RequestBody DetalleVentas dv) {
		data.save(dv);
	}
	
	@PutMapping
	public void modificar(@RequestBody DetalleVentas dv) {
		data.save(dv);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		data.deleteById(id);
	}

}
