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
import com.tambo.interfaces.ProveedorInterface;
import com.tambo.modelos.Proveedor;

@RestController
@RequestMapping("/rest_prove") 
@CrossOrigin(origins = "http://localhost:4200")
public class RestProveedor {
	
	@Autowired
	private ProveedorInterface data;
	
	@GetMapping
	public List<Proveedor> listar(){
		return(List<Proveedor>)data.findAll();
	}
	
	@GetMapping(value ="/{id}")
	public Optional<Proveedor> listarId(@PathVariable("id") Integer id) {		
		return data.findById(id);
	}
	
	
	@PostMapping
	public void insertar(@RequestBody Proveedor prove) {
		data.save(prove);
	}
	
	@PutMapping
	public void modificar(@RequestBody Proveedor prove) {
		data.save(prove);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		data.deleteById(id);
	}

}
