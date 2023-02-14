package com.example.demo.repo;

import java.util.ArrayList;
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
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		// Select * from hotel h INNER JOIN habitacion hab on h.hote_id =
		// ha.habi_id_hotel
		// Debemos hacer relacion a la tabla que tiene mi tabla principal

		// h.habitaciones a traves de esta condicion se igual el PK = FK
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h from Hotel h  INNER JOIN h.habitaciones ha WHERE ha.tipo =:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		//PARA EL ERROR DEL LAZY
		List<Hotel> listaHoteles =myQuery.getResultList();
		
		//ME RETORNA BAJO DEMANDA, le decimos que en un futuro vamos a acceder a nuestras habitaciones
		List<Hotel> tmp;
		for (Hotel hotel : listaHoteles) {
			List<Habitacion> listaTmp = new ArrayList<>();
			for(Habitacion ha: hotel.getHabitaciones())
			if(ha.getTipo().equals(tipoHabitacion)) {
			 listaTmp.add(ha);
			}
			hotel.setHabitaciones(listaTmp);
		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOuterLetfJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h from Hotel h  LEFT JOIN h.habitaciones ha WHERE ha.tipo =:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		//PARA EL ERROR DEL LAZY
		List<Hotel> listaHoteles =myQuery.getResultList();
		
		//ME RETORNA BAJO DEMANDA, le decimos que en un futuro vamos a acceder a nuestras habitaciones
		for (Hotel hotel : listaHoteles) {
			hotel.getHabitaciones().size();
			
		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h from Hotel h  RIGHT JOIN h.habitaciones ha WHERE ha.tipo =:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		//PARA EL ERROR DEL LAZY
		List<Hotel> listaHoteles =myQuery.getResultList();
		
		//ME RETORNA BAJO DEMANDA, le decimos que en un futuro vamos a acceder a nuestras habitaciones
		/*for (Hotel hotel : listaHoteles) {
			hotel.getHabitaciones().size();
			
		}*/
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
