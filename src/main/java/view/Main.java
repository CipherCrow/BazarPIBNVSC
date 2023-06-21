package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("pedro");
		pessoa.setNome("ruan");
		pessoa.setObservacao("nenhuma");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bazar");
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		em.close();
	}
}