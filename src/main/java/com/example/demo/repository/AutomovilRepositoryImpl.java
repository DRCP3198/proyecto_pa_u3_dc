package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class AutomovilRepositoryImpl implements IAutomovilRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

	@Override
	public Automovil buscarPlacaTyped(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery =this.entityManager.createQuery("select a from Automovil a where a.placa = :datoPlaca",Automovil.class);
		myTypedQuery.setParameter("datoPlaca", placa);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarModeloTyped(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery =this.entityManager.createQuery("select a from Automovil a where a.modelo = :datoModelo",Automovil.class);
		myTypedQuery.setParameter("datoModelo", modelo);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPrecioTyped(BigDecimal precio) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery =this.entityManager.createQuery("select a from Automovil a where a.precio = :datoPrecio",Automovil.class);
		myTypedQuery.setParameter("datoPrecio", precio);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPlaca");
		myQuery.setParameter("datoPlaca", placa);
		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarColor");
		myQuery.setParameter("datoColor", color);
		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public List<Automovil> buscarTipoNamedQuery(String tipo) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarTipo");
		myQuery.setParameter("datoTipo", tipo);
		
		return  myQuery.getResultList();
	}

	@Override
	public Automovil buscarColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where aut_color = :datoColor ",Automovil.class);
		myQuery.setParameter("datoColor", color);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarCilindajeNativeQuery(String cilindraje) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where aut_cilindraje = :datoCilindraje ",Automovil.class);
		myQuery.setParameter("datoCilindraje", cilindraje);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where aut_placa = :datoPlaca ",Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public List<Automovil> buscarTipoNamedNativeQuery(String tipo) {
	    Query myQuery= this.entityManager.createNamedQuery("Automovil.buscarPorTipoNative");
	    myQuery.setParameter("datoTipo1", tipo);
	    return  myQuery.getResultList();
	}

	@Override
	public Automovil buscarCilindajeNamedNativeQuery(String cilindraje) {
		// TODO Auto-generated method stub
		 Query myQuery= this.entityManager.createNamedQuery("Automovil.buscarPorCilindrajeNative",Automovil.class);
		    myQuery.setParameter("datoCilindraje", cilindraje);
		    return (Automovil) myQuery.getSingleResult();
		
	}

	@Override
	public Automovil buscarPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
	    Query myQuery= this.entityManager.createNamedQuery("Automovil.buscarPorPlacaN",Automovil.class);
	    myQuery.setParameter("datoPlaca", placa);
	    return (Automovil) myQuery.getSingleResult();
	
	}

}
