package com.prueba.repositorio;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.prueba.modelo.Usuario;

@Service
@Repository
@Transactional
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	//Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    //boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByCorreo(String correo);
    boolean existsByNumeroDocumento(int numeroDocumento);
	

}
