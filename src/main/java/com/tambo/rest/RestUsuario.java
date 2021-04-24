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
import com.tambo.interfaces.UsuarioInterface;
import com.tambo.modelos.Usuario;

@RestController
@RequestMapping("/rest_usu") 
@CrossOrigin(origins = "http://localhost:4200")
public class RestUsuario {

	@Autowired
	private UsuarioInterface data;
	
	@GetMapping
	public List<Usuario> listar(){
		return(List<Usuario>)data.findAll();
	}
	
	@GetMapping(value ="/{id}")
	public Optional<Usuario> listarId(@PathVariable("id") Integer id) {		
		return data.findById(id);
	}
	
	
	@PostMapping
	public void insertar(@RequestBody Usuario usu) {
		data.save(usu);
	}
	
	@PutMapping
	public void modificar(@RequestBody Usuario usu) {
		data.save(usu);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		data.deleteById(id);
	}
	
}
