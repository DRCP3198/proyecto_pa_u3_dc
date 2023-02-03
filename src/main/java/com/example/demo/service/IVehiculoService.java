package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {

	public void agregar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo encontrar(String  placa);
	public void eliminar(String placa);
}
