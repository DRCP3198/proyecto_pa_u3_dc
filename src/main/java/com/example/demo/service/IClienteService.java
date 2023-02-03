package com.example.demo.service;

import com.example.demo.modelo.Cliente;

public interface IClienteService {
	
	
	public void agregar(Cliente cliente );
	public void modificar(Cliente cliente);
	public Cliente encontrar(String cedula);
	public Cliente encontrarQuery(String cedula);
	public void eliminar(String cedula);

}
