package view;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import controller.EntityManagerUtil;
import model.dao.PessoaDAO;
import model.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("pedro");
		pessoa.setNome("ruan");
		pessoa.setObservacao("nenhuma");
		
		Pessoa pessoa2 = new Pessoa("Jonas","Tora",LocalDate.now(),LocalDate.now());
		
		EntityManager em = EntityManagerUtil.getEntityManager();
		PessoaDAO pessoaDAO = new PessoaDAO(em);
		
		em.getTransaction().begin();
		
		pessoaDAO.cadastrar(pessoa);
		pessoaDAO.cadastrar(pessoa2);
		
		em.getTransaction().commit();
		em.close();
	}
}