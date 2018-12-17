package edu.mum.m2.dao.daoImpl;


import edu.mum.m2.dao.GenericDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/*@SuppressWarnings("unchecked")
@Repository*/
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	@PersistenceContext
    protected EntityManager entityManager;

    protected Class<T> daoType;

	public void setDaoType(Class<T> type) {
			daoType = type;
	}
   
    @Override
    public void save( T entity ){
        entityManager.persist( entity );
     }

    public void delete( T entity ){
        entityManager.remove( entity );
     }

	@Override
	public void delete(Long id) {
        T entity = findOne( id );
        delete( entity );  
    }

	@Override
	public T findOne( Long id ){
	    return (T) entityManager.find( daoType, id );
	 }
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(){
		      return entityManager.createQuery( "from " + daoType.getName() )
		       .getResultList();
		   }
	
	@Override
	public T update( T entity ){
	      return entityManager.merge( entity );
	   }

 	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(String s, Object hint ){
 	    return (List<T>)  entityManager.createQuery("SELECT m FROM Member AS m")
 	    		.setHint(s,hint).getResultList();
  	}
	

 }