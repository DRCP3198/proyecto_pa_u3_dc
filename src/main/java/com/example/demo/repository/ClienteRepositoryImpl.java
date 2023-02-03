package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepositoryImpl  implements IClienteRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void inserta(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cliente = this.entityManager.find(Cliente.class, cedula);
		cliente.getRentas().size();
		return cliente;
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cli =this.buscar(cedula);
		this.entityManager.remove(cli);
		
	}

	@Override
	public Cliente buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select c from Cliente c where c.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula",cedula);
		return (Cliente)jpqlQuery.getSingleResult();
	}
	
	

}
