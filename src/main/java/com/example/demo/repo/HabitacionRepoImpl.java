package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HabitacionRepoImpl implements IHabitacionRepo{

	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Habitacion> buscarHabitacionInnerJoin() {
		// TODO Auto-generated method stub
		
	   return null;
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterLetfJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery(
				"SELECT ha from Hotel h LEFT JOIN  h.habitaciones ha ", Habitacion.class);
        List<Habitacion> lista =myQuery.getResultList();
        /*for (Habitacion h : lista) {
			h.getHabitaciones().size();
		}*/
		return lista;
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery(
				"SELECT ha from Hotel h RIGHT JOIN  h.habitaciones ha ", Habitacion.class);
        List<Habitacion> lista =myQuery.getResultList();
        /*for (Habitacion h : lista) {
			h.getHabitaciones().size();
		}*/
		return lista;
	}
	
	

}
