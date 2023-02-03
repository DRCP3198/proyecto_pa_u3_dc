package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepository;

@Service
public class ClienteServiceImpl  implements IClienteService{

	@Autowired
	private IClienteRepository clienteRepository;
	
	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepository.inserta(cliente);
	}

	@Override
	public void modificar(Cliente cliente) {
		// TODO Auto-generated method stub
	    this.clienteRepository.actualizar(cliente);	
	}

	@Override
	public Cliente encontrar(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepository.buscar(cedula);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.clienteRepository.borrar(cedula);
	}

	@Override
	public Cliente encontrarQuery(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepository.buscarPorCedulaQuery(cedula);
	}

}
