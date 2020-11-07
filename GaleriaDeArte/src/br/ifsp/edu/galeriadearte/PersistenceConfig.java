package br.ifsp.edu.galeriadearte;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
 
public class PersistenceConfig {
	
	private static final EntityManagerFactory entity = Persistence.createEntityManagerFactory("obras");

	public static void main(String[] args) {
		inserirDados();

	}
	
	private static void inserirDados() {		
		EntityManager entityManager = entity.createEntityManager();
		ObraDeArte obraDeArte = new ObraDeArte();
		
		obraDeArte.setAutor("Seu Bonifácio");
		obraDeArte.setTecnica("óleo sobre tela");
		obraDeArte.setTipo("Pintura");
		obraDeArte.setTitulo("Um devaneio");
		obraDeArte.setProcedencia("Procede");
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1997);
		calendar.set(Calendar.MONTH, 6);
		calendar.set(Calendar.DAY_OF_MONTH, 25); 
		
		obraDeArte.setData(calendar);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(obraDeArte);
		transaction.commit();
		entityManager.close();
		
		
	}

}
