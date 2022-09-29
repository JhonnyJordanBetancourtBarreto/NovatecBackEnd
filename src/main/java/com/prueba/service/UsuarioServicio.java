package com.prueba.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.modelo.Usuario;
import com.prueba.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio implements UsuarioRepositorio {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@Override
	public List<Usuario> findAll() {
		return usuarioRepositorio.findAll();
	}

	@Override
	public List<Usuario> findAll(Sort sort) {
		return usuarioRepositorio.findAll(sort);
	}
	
	@Override
	public List<Usuario> findAllById(Iterable<Long> ids) {
		return usuarioRepositorio.findAllById(ids);
	}

	@Override
	public <S extends Usuario> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Usuario> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Usuario> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> List<S> findAll(Example<S> example) {
		//return (List<S>) usuarioRepositorio.findAll();
		return null;
	}

	@Override
	public <S extends Usuario> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <S extends Usuario> S save(S entity) {
		return usuarioRepositorio.save(entity);
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		usuarioRepositorio.deleteById(id);
		
	}

	@Override
	public void delete(Usuario entity) {
		usuarioRepositorio.delete(entity);		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Usuario> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Usuario> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Usuario> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Usuario, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public boolean existsByCorreo(String correo) {
		return usuarioRepositorio.existsByCorreo(correo);
	}
	
	@Override
	public boolean existsByNumeroDocumento(int numeroDocumento) {
		return usuarioRepositorio.existsByNumeroDocumento(numeroDocumento);
	}

	@Override
	public Usuario getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
