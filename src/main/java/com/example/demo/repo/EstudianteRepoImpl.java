package com.example.demo.repo;



import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional 
@Repository
public class EstudianteRepoImpl  implements IEstudianteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre = 'Dillan' seria el Query normal
		//vamos a declarar el tipo de clase Query, siempre le doy un alisas "e", el e 
		//se remplaza por el * y me indica que me traiga todo
		//JPQL seria:  select e from Estudiante e where e.nombre = :datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		
		return (Estudiante) jpqlQuery.getSingleResult(); //Tengo que castear por que siempre me devuelve genericos mi jpqlQuery
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
