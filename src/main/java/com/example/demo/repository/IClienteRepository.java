package com.example.demo.repository;

import com.example.demo.modelo.Cliente;

public interface IClienteRepository {
	
	
	public void inserta(Cliente cliente );
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);
	public void borrar(String cedula);
	public Cliente buscarPorCedulaQuery(String cedula);
	
	

}
