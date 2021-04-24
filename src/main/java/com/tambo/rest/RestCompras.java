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

import com.tambo.interfaces.ComprasInterface;
import com.tambo.modelos.Compras;

@RestController
@RequestMapping("/rest_comp") 
@CrossOrigin(origins = "http://localhost:4200")
public class RestCompras {
	
	@Autowired 
	private ComprasInterface data;
	
	@GetMapping
	public List<Compras> listar(){
		return(List<Compras>)data.findAll(); 
	}
	
	@GetMapping(value ="/{id}")
	public Optional<Compras> listarId(@PathVariable("id") Integer id) {		
		return data.findById(id);
	}
	
	
	@PostMapping
	public void insertar(@RequestBody Compras comp) {
		data.save(comp);
	}
	
	@PutMapping
	public void modificar(@RequestBody Compras comp) {
		data.save(comp);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		data.deleteById(id);
	}

}
