package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IClienteRepository;
import com.example.demo.repository.IRentaRepository;
import com.example.demo.repository.IVehiculoRepository;

@Service
public class RentaServiceImpl implements IRentaService{

	@Autowired
	private IRentaRepository iRentaRepository;
	
	@Autowired
	private IClienteRepository clienteRepository;
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	public void agregar(Renta renta) {
		// TODO Auto-generated method stub
		this.iRentaRepository.insertar(renta);
	}

	@Override
	public void modificar(Renta renta) {
		// TODO Auto-generated method stub
		this.iRentaRepository.actualizar(renta);
	}

	@Override
	public Renta encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRentaRepository.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iRentaRepository.borrar(id);
	}

	@Override
	public void rentar(String cedula,String placa) {
		// TODO Auto-generated method stub
		Renta renta = new Renta();
		Cliente cliente = this.clienteRepository.buscar(cedula);
		Vehiculo vehiculo = this.vehiculoRepository.buscar(placa);
		renta.setFecha(LocalDateTime.now());
		renta.setNumeroDias(12);
		renta.setValor(new BigDecimal(12.5));
		renta.setClientes(cliente);
		renta.setVehiculos(vehiculo);
		this.iRentaRepository.insertar(renta);
	}

}
