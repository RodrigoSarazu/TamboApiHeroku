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
import com.tambo.interfaces.ProductosInterface;
import com.tambo.modelos.Productos;

@RestController
@RequestMapping("/rest_pro") 
@CrossOrigin(origins = "http://localhost:4200")
public class RestProductos {
	
	@Autowired
	private ProductosInterface data;
	
	@GetMapping
	public List<Productos> listar(){
		return(List<Productos>)data.findAll(); 
	}
	
	@GetMapping(value ="/{id}")
	public Optional<Productos> listarId(@PathVariable("id") Integer id) {		
		return data.findById(id);
	}
	
	
	@PostMapping
	public void insertar(@RequestBody Productos pro) {
		data.save(pro);
	}
	
	@PutMapping
	public void modificar(@RequestBody Productos pro) {
		data.save(pro);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		data.deleteById(id);
	}

}
