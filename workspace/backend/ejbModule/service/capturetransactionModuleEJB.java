package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.CapturetransactionEntity;

/**
 * Session Bean implementation class capturetransactionModuleEJB
 */
@Stateless
@LocalBean
public class capturetransactionModuleEJB {

   @PersistenceContext  
   private EntityManager em;
    public capturetransactionModuleEJB() {
       
    }
    public void addNew( CapturetransactionEntity capturetransactionEntity)
    {
    	
    	em.persist(capturetransactionEntity);
    }

} 
