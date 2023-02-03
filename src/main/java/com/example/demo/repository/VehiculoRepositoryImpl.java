package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional 
@Repository
public class VehiculoRepositoryImpl  implements IVehiculoRepository{
	
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo= this.entityManager.find(Vehiculo.class, placa);
		vehiculo.getRentas().size();
		return vehiculo;
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.buscar(placa);
		this.entityManager.remove(vehiculo);
	}
	
	

}
