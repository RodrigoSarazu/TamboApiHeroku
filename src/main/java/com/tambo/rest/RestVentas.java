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
import com.tambo.interfaces.VentasInterface;
import com.tambo.modelos.Ventas;

@RestController
@RequestMapping("/rest_ven") 
@CrossOrigin(origins = "http://localhost:4200")
public class RestVentas {
	
	@Autowired
	private VentasInterface data;
	
	@GetMapping
	public List<Ventas> listar(){
		return(List<Ventas>)data.findAll();
	}
	
	@GetMapping(value ="/{id}")
	public Optional<Ventas> listarId(@PathVariable("id") Integer id) {		
		return data.findById(id);
	}
	
	
	@PostMapping
	public void insertar(@RequestBody Ventas ven) {
		data.save(ven);
	}
	
	@PutMapping
	public void modificar(@RequestBody Ventas ven) {
		data.save(ven);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		data.deleteById(id);
	}

}
