package com.example.demo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitacion")
public class Habitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "habi_seq")
	//Buena practica el nombre se le coloca el mismo de la secuencia
	@SequenceGenerator(name ="habi_seq",sequenceName = "habi_seq",allocationSize = 1) 
	@Column(name ="habi_id")
	private Integer id;
	
	@Column(name ="habi_numero")
	private String numero;
	
	@Column(name ="habi_tipo")
	private String tipo;
	
	//Relacion habitacion hotel, uno a muchos
	@ManyToOne()
	@JoinColumn(name= "habi_id_hotel") //con la columna que va hacer relacion habi por habitacion y hotel por que tiene la PK de hotel
	private Hotel hotel;
	
	
	//SET y GET
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

	
	
	

}
