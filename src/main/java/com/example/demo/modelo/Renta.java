package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "renta")
public class Renta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_rent")
	@SequenceGenerator(name = "seq_rent",sequenceName = "seq_rent",allocationSize = 1)
	@Column(name = "rent_id")
	private Integer id;
	
	@Column(name = "rent_fecha")
	private LocalDateTime fecha;
	
	@Column(name = "rent_valor")
	private BigDecimal valor;
	
	@Column(name = "ret_numeroDias")
	private Integer numeroDias;

	@ManyToOne
	@JoinColumn(name= "renta_id_cliente")
	private Cliente clientes;
	
	@ManyToOne
	@JoinColumn(name = "renta_id_vehiculo")
	private Vehiculo vehiculos;
	
	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(Integer numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public Vehiculo getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", valor=" + valor + ", numeroDias=" + numeroDias
				+  "]";
	}
	
	
	
}
