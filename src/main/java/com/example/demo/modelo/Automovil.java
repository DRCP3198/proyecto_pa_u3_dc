package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name="automovil")


@NamedQueries({
		@NamedQuery(name ="Automovil.buscarPlaca",query="select a from Automovil a where a.placa = :datoPlaca"),
        @NamedQuery(name ="Automovil.buscarColor",query="select a from Automovil a where a.color = :datoColor"),
        @NamedQuery(name ="Automovil.buscarTipo",query="select a from Automovil a where a.tipo = :datoTipo"),
})
@NamedNativeQueries({
@NamedNativeQuery(name= "Automovil.buscarPorPlacaN", query = "select * from automovil where aut_placa = :datoPlaca", resultClass = Automovil.class),
@NamedNativeQuery(name="Automovil.buscarPorTipoNative",query="select * from automovil where aut_tipo = :datoTipo1",resultClass = Automovil.class),
@NamedNativeQuery(name="Automovil.buscarPorCilindrajeNative",query="select * from automovil where aut_cilindraje = :datoCilindraje",resultClass = Automovil.class)
})
public class Automovil {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aut")
	@SequenceGenerator(name = "seq_aut",sequenceName = "seq_aut", allocationSize = 1)
	@Column(name = "aut_id")
	private Integer id;
	
	@Column(name = "aut_placa")
	private String placa;
	
	@Column(name = "aut_marca")
	private String marca;
	
	@Column(name = "aut_modelo")
	private String modelo;
	
	@Column(name = "aut_color")
	private String color;
	
	@Column(name = "aut_precio")
	private BigDecimal precio;
	
	@Column(name = "aut_tipo")
	private String tipo;
	
	
	@Column(name = "aut_cilindraje")
	private String cilindaje;


	
	//Set y get
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCilindaje() {
		return cilindaje;
	}


	public void setCilindaje(String cilindaje) {
		this.cilindaje = cilindaje;
	}


	@Override
	public String toString() {
		return "Automovil [id=" + id + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", precio=" + precio + ", tipo=" + tipo + ", cilindaje=" + cilindaje + "]";
	}
	
	
	
	

}
