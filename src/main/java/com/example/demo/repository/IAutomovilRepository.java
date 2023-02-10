package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.modelo.Automovil;



public interface IAutomovilRepository {
	//INSERTAR
	public void insertar(Automovil automovil);
	//Typed
	public Automovil buscarPlacaTyped(String placa);
	public Automovil buscarModeloTyped(String modelo);
	public Automovil buscarPrecioTyped(BigDecimal precio);
	
	//NamedQuery
	public Automovil buscarPlacaNamedQuery(String placa);
	public Automovil buscarColorNamedQuery(String color);
	public List<Automovil> buscarTipoNamedQuery(String tipo);
	
	//NativeQuey
	public Automovil buscarColorNativeQuery(String color);
	public Automovil buscarCilindajeNativeQuery(String cilindraje);
	public Automovil buscarPlacaNativeQuery(String placa);
	
	//Named Native Query
	public List<Automovil> buscarTipoNamedNativeQuery(String tipo);
	public Automovil buscarCilindajeNamedNativeQuery(String cilindraje);
	public Automovil buscarPlacaNamedNativeQuery(String placa);
	
	
	

}
