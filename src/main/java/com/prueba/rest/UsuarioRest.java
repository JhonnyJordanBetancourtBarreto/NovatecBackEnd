package com.prueba.rest;

import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import javax.persistence.NoResultException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.modelo.Mensaje;
import com.prueba.modelo.Usuario;
import com.prueba.service.UsuarioServicio;


@RestController
//@Controller
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioRest {

	@Autowired
	UsuarioServicio usuarioServicio;
	
	@PostMapping("/crearUsuario")
	public ResponseEntity<?> nuevo(@Valid @RequestBody Usuario nuevoUsuario, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return new ResponseEntity(new Mensaje("Campos incorrectos o vácios."), HttpStatus.BAD_REQUEST);
		} else if (usuarioServicio.existsByCorreo(nuevoUsuario.getCorreo())) {
			return new ResponseEntity(new Mensaje("El email ya está en uso."), HttpStatus.BAD_REQUEST);
		} else if (usuarioServicio.existsByNumeroDocumento(nuevoUsuario.getNumeroDocumento())) {
			return new ResponseEntity(new Mensaje("El número de documento está en uso."), HttpStatus.BAD_REQUEST);
		}
		Usuario usuario = new Usuario( 
				nuevoUsuario.getPrimerNombre(),
				nuevoUsuario.getSegundoNombre(),
				nuevoUsuario.getPrimerApellido(),
				nuevoUsuario.getSegundoApellido(),
				nuevoUsuario.getNumeroDocumento(),
				nuevoUsuario.getEdad(),
				nuevoUsuario.getSexo(),
				nuevoUsuario.getCorreo(),
				nuevoUsuario.getRol()
				);
		usuarioServicio.save(usuario);
		try {
			ResponseEntity.created(new URI("/usuario/" + usuario.getId())).body(nuevoUsuario);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return new ResponseEntity(new Mensaje("usuario creado exitosamente"), HttpStatus.CREATED);
	}
	
	@GetMapping("/listaUsuarios")
	private ResponseEntity<List<Usuario>> getAllUsuario() {
		List<Usuario> list = usuarioServicio.findAll();
		return new ResponseEntity(list, HttpStatus.OK);		  
	}

}
