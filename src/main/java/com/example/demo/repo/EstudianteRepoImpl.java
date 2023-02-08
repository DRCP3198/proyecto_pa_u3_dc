package com.example.demo.repo;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
		//Query normal: select *from estudiante where estu_apellido = "Coloma";
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante)jpqlQuery.getSingleResult();
	}
	
	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_cedula =""; 
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoGenero");
		jpqlQuery.setParameter("datoGenero",cedula);
		return (Estudiante)jpqlQuery.getSingleResult() ;
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_ciudad = "Quito"
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante)jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_genero = "masculino"
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante)jpqlQuery.getSingleResult();
	}
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	//TIPO TYPED QUERY
	@Override
	public Estudiante buscarPorNombreQueryType(String nombre) {
		// TODO Auto-generated method stub
		
		//Declaramos un tipo TypeQuery <Especificar el tipo de dato que usare>
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre");
		myQuery.setParameter("datoNombre", nombre);
		
		return (Estudiante) myQuery.getSingleResult();
		
	}

	//PODEMOS hacer una combinacion  con type y named Query
	@Override
	public Estudiante buscarPorNombreNamedQueryType(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	//Native Query
	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from estudiante where estu_nombre = :datoNombre ", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
		
	}

	@Override
	public Estudiante buscarPorNombreNativeTypeNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		
		return jpqlQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorNombreQueryListPrimerElementoLista(String nombre) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		
		return (Estudiante) jpqlQuery.getResultList().get(0);
	}
    //QUERY TYPE TDO
	@Override
	public EstudianteDTO buscarPorNombreQueryTypeDTO(String nombre) {
		// TODO Auto-generated method stub
		//Declaramos un tipo TypeQuery <Especificar el tipo de dato que usare>
				TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager.createQuery("select NEW EstudianteDTO(e.nombre,e.apellido,e.cedula) e from Estudiante e where e.nombre = :datoNombre", EstudianteDTO.class);
				myTypedQuery.setParameter("datoNombre", nombre);
				return myTypedQuery.getSingleResult();
	}

	
}
