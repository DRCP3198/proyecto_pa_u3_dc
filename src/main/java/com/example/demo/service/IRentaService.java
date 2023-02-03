package com.example.demo.service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;

public interface IRentaService {
	public void agregar(Renta renta);
	public void modificar(Renta renta);
	public Renta encontrar(Integer id);
	public void eliminar(Integer id);
	public void rentar(String cedula, String placa);
	

}
