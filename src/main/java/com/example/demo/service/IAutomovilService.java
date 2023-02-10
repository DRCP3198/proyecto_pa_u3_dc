package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {
	//INSERTAR
		public void agregar(Automovil automovil);
		//Typed
		public Automovil encontrarPlacaTyped(String placa);
		public Automovil encontrarModeloTyped(String modelo);
		public Automovil encontrarPrecioTyped(BigDecimal precio);
		
		//NamedQuery
		public Automovil encontrarPlacaNamedQuery(String placa);
		public Automovil encontrarColorNamedQuery(String color);
		public List<Automovil> encontrarTipoNamedQuery(String tipo);
		
		//NativeQuey
		public Automovil encontrarColorNativeQuery(String color);
		public Automovil encontrarCilindajeNativeQuery(String cilindraje);
		public Automovil encontrarPlacaNativeQuery(String placa);
		
		//Named Native Query
		public List<Automovil> encontrarTipoNamedNativeQuery(String tipo);
		public Automovil encontrarCilindajeNamedNativeQuery(String cilindraje);
		public Automovil encontrarPlacaNamedNativeQuery(String placa);
}
