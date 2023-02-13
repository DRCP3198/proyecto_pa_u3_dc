package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "hote_seq")
	//Buena practica el nombre se le coloca el mismo de la secuencia
	@SequenceGenerator(name ="hote_seq",sequenceName = "hote_seq",allocationSize = 1) 
	@Column(name="hote_id")
	private Integer id;
	@Column(name="hote_nombre")
	private String nombre;
	@Column(name="hote_direccion")
	private String direccion;
	
	@Column(name="hote_ciudad")
	private String ciudad;
	
	@Column(name="hote_telefono")
	private String telefono;

	//El hotel tiene muchas habitaciones 
	//@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
	private List<Habitacion> habitaciones;
	
	
	//SET y GET
	
	public Integer getId() {
		return id;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", habitaciones=" + habitaciones
				+ "]";
	}
	
	

}
