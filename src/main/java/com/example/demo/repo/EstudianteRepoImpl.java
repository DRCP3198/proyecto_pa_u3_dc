package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

import aj.org.objectweb.asm.Type;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		// select * from estudiante where estu_nombre = 'Dillan' seria el Query normal
		// vamos a declarar el tipo de clase Query, siempre le doy un alisas "e", el e
		// se remplaza por el * y me indica que me traiga todo
		// JPQL seria: select e from Estudiante e where e.nombre = :datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);

		return (Estudiante) jpqlQuery.getSingleResult(); // Tengo que castear por que siempre me devuelve genericos mi
															// jpqlQuery
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		// Query normal: select *from estudiante where estu_apellido = "Coloma";
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		// select * from estudiante where estu_cedula ="";
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoGenero");
		jpqlQuery.setParameter("datoGenero", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		// select * from estudiante where estu_ciudad = "Quito"
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		// select * from estudiante where estu_genero = "masculino"
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	// TIPO TYPED QUERY
	@Override
	public Estudiante buscarPorNombreQueryType(String nombre) {
		// TODO Auto-generated method stub

		// Declaramos un tipo TypeQuery <Especificar el tipo de dato que usare>
		TypedQuery<Estudiante> myTypedQuery = this.entityManager
				.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
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

	// PODEMOS hacer una combinacion con type y named Query
	@Override
	public Estudiante buscarPorNombreNamedQueryType(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre",
				Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	// Native Query
	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createNativeQuery("select * from estudiante where estu_nombre = :datoNombre ", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();

	}

	@Override
	public Estudiante buscarPorNombreNativeTypeNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
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

	// QUERY TYPE TDO
	@Override
	public List<EstudianteDTO> buscarPorNombreQueryTypeDTO(String nombre) {
		// TODO Auto-generated method stub
		// Declaramos un tipo TypeQuery <Especificar el tipo de dato que usare>
		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager.createQuery(
				"select NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre,e.apellido,e.cedula) e from Estudiante e where e.nombre = :datoNombre",
				EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getResultList();
	}

	// CRITERIAL API QUERY
	@Override
	public List<Estudiante> buscarPorNombreCriterial(String nombre) {
		// TODO Auto-generated method stub
		// 1.Construimos mi fabrica
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		
		// 2.Tenemos que especificar el tipo de retorno de mi SQL "Query"
		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		// Aqui empezamos a crear el SQL como tal, se define la tabla destino "from",
		// ese from va a ser tomado como mi ruta principal FROM-Root
		Root<Estudiante> miTablaFrom = myQuery.from(Estudiante.class); // Especificamos el tipo de dato mi mi tablaRoot
																		// = From Estudiante

		// Las condiciones WHERE se conocen en criteria api Query como PREDICADOS
		// la condicion e.nombre =:datoNombre
		// en el sengundo argumento le mando con lo que deba comparar
		Predicate condicion1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
		myQuery.select(miTablaFrom).where(condicion1);
		// Declarado el Query

		// La ejecucion del Query lo realizamos con cualquier tipo ya conocido,
		// recomendacion Typed QUery
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(myQuery);

		return myTypedQuery.getResultList();
	}
	/*public List<Estudiante> buscarPorNombreCriterial(String apellido) {
		 CriteriaBuilder mifabrica = this.entityManager.getCriteriaBuilder();
		 
		 CriteriaQuery<Estudiante> myCriteriaQuery = mifabrica.createQuery(Estudiante.class);
		 
		 Root<Estudiante> root =  myCriteriaQuery.from(Estudiante.class);
		 
		 //Condicion Where en critery api es el Predicado
		 Predicate condicion1 = mifabrica.equal(root.get("apellido"), apellido);
		 myCriteriaQuery.select(root).where(condicion1);
		 
		 TypedQuery<Estudiante> query = this.entityManager.createQuery(myCriteriaQuery);
		 return query.getResultList();
		 
		 
	}*/
	

	@Override
	public List<Estudiante> buscarPorNombreCriterialAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		// 1.Construimos mi fabrica
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		// 2.Tenemos que especificar el tipo de retorno de mi SQL "Query"
		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		// Aqui empezamos a crear el SQL como tal, se define la tabla destino "from",
		// ese from va a ser tomado como mi ruta principal FROM-Root
		Root<Estudiante> miTablaFrom = myQuery.from(Estudiante.class);

		// M: e.nombre = AND e.apellido ->Cuando sea masculino va a armar con esta
		// condicion
		// F: e.nombre = OR e.apellido ->Cuando sea Femenini va a armar con esta
		// condicion
		// Creamos los Predicados
		// Predicado del Nombre
		Predicate p1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
		// Predicado del Apellido
		Predicate p2 = myBuilder.equal(miTablaFrom.get("apellido"), apellido);

		// Cuando quiero conformar un AND o un OR pasa a ser un Predicado mas

		Predicate predicadoFinal = null;
		if (genero.equals("M")) {
			// Predicado de AND
			predicadoFinal = myBuilder.and(p1, p2);

		} else {
			// Predicado de OR
			predicadoFinal = myBuilder.or(p1, p2);
		}
		
		myQuery.select(miTablaFrom).where(predicadoFinal);
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(myQuery);

		return myTypedQuery.getResultList();

	}
    //METODOS  NUEVOS
	@Override
	public int eliminarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		//DELETE from estudiante where  estu_apellido = 'Teran'
		Query query = this.entityManager.createQuery("DELETE from Estudiante e where e.apellido = :datoApellido");
		query.setParameter("datoApellido", apellido);
		return query.executeUpdate(); //executeUpadate
	}

	@Override
	public int actualizarPorApellido(String apellido, String nombre) {
		// TODO Auto-generated method stub
		//UPDATE estudiante set estu_nombre = 'Edison' where estu_apellido = 'Cayambe'
		Query query = this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre = :datoNombre where e.apellido = :datoApellido");
		query.setParameter("datoNombre", nombre);
		query.setParameter("datoApellido", apellido);
		return query.executeUpdate(); //El execute Update me retorna un ENTERO que es la cantidad de parametros que me modifica
	}

	@Override
	public int eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("DELETE from Estudiante e where e.genero = :datoGenero");
		query.setParameter("datoGenero", genero);
		return query.executeUpdate(); //executeUpadate
	}

	@Override
	public int eliminarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("DELETE from Estudiante e where e.cedula = :datoCedula");
		query.setParameter("datoCedula", cedula);
		return query.executeUpdate(); //executeUpadate
	}

	@Override
	public int actualizarPorCedula(String cedula, String ciudad) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("UPDATE Estudiante e SET e.ciudad = :datoCiudad where e.cedula = :datoCedula");
		query.setParameter("datoCiudad", ciudad);
		query.setParameter("datoCedula", cedula);
		return query.executeUpdate(); //El execute Update me retorna un ENTERO que es la cantidad de parametros que me modifica
	}

	@Override
	public int actualizarPorCiudad(String ciudad, String hobby) {
		// TODO Auto-generated method stub
		
		Query query = this.entityManager.createQuery("UPDATE Estudiante e SET e.hobby =:datoHobby where e.ciudad = :datoCiudad");
		query.setParameter("datoHobby", hobby);
		query.setParameter("datoCiudad", ciudad);
		return query.executeUpdate();
	}

}
