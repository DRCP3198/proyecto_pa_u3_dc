package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepository;

@Service
public class AutomovilServiceImpl  implements IAutomovilService{

	@Autowired
	private IAutomovilRepository automovilRepository;
	
	
	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepository.insertar(automovil);
	}

	@Override
	public Automovil encontrarPlacaTyped(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPlacaTyped(placa);
	}

	@Override
	public Automovil encontrarModeloTyped(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarModeloTyped(modelo);
	}

	@Override
	public Automovil encontrarPrecioTyped(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPrecioTyped(precio);
	}

	@Override
	public Automovil encontrarPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPlacaNamedQuery(placa);
	}

	@Override
	public Automovil encontrarColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarColorNamedQuery(color);
	}

	@Override
	public List<Automovil> encontrarTipoNamedQuery(String tipo) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarTipoNamedQuery(tipo);
	}

	@Override
	public Automovil encontrarColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarColorNativeQuery(color);
	}

	@Override
	public Automovil encontrarCilindajeNativeQuery(String cilindraje) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarCilindajeNativeQuery(cilindraje);
	}

	@Override
	public Automovil encontrarPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPlacaNativeQuery(placa);
	}

	@Override
	public List<Automovil> encontrarTipoNamedNativeQuery(String tipo) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarTipoNamedNativeQuery(tipo);
	}

	@Override
	public Automovil encontrarCilindajeNamedNativeQuery(String cilindraje) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarCilindajeNamedNativeQuery(cilindraje);
	}

	@Override
	public Automovil encontrarPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPlacaNamedNativeQuery(placa);
	}

}
