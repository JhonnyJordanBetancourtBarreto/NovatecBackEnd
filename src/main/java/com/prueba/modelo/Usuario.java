package com.prueba.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
/*
@Entity
@Table(name = "usuario")
public class Usuario {
	//Se define los campos en la base de datos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombreUsuario;
	private String contrasena;
	private String correo;
	
	@ManyToOne
	@JoinColumn (name="id_rol")
	private Rol rol;

	//función del constructor
	public Usuario() {

	}
	
	public Usuario(String nombreUusario, String contrasena, String correo, Rol rol) {
		super();
		this.nombreUsuario = nombreUusario;
		this.contrasena = contrasena;
		this.correo = correo;
		this.rol = rol;
	}
	
	//Gets and set de los campos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
*/
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank
    private String primerNombre;

    private String segundoNombre;
    
    @NotBlank
    private String primerApellido;
    
    private String segundoApellido;
    
    private int numeroDocumento;
    
    private int edad;
    
    private String sexo;
    
    @Email
    private String correo;
    
    private String rol;
    
    
    //función del constructor
  	public Usuario() {

  	}
  	
  	public Usuario(
  			@NotNull String primerNombre, 
  			@NotNull String primerApellido,
  			@NotNull int numeroDocumento,
  			@NotNull int edad,
  			@NotNull String sexo,
  			@NotNull String correo,
  			@NotNull String rol) {
  		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.numeroDocumento = numeroDocumento;
		this.edad = edad;
		this.sexo = sexo;
  		this.correo = correo;
  		this.rol = rol;
  	}
  	
  	public Usuario(
  			@NotNull String primerNombre,
  			String segundoNombre,
  			@NotNull String primerApellido, 
  			String segundoApellido,
  			@NotNull int numeroDocumento,
  			@NotNull int edad,
  			@NotNull String sexo,
  			@NotNull String correo,
  			@NotNull String rol
			) {

  		this.primerNombre = primerNombre;
  		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.numeroDocumento = numeroDocumento;
		this.edad = edad;
		this.sexo = sexo;
  		this.correo = correo;
  		this.rol = rol;
	}
  	
  	//Gets and set de los campos
  	public int getId() {
  		return id;
  	}
  	
  	public void setId(int id) {
  		this.id = id;
  	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}
