package model.dao;

import javax.persistence.EntityManager;

import model.entities.Pessoa;

public class PessoaDAO implements DAO {

	private EntityManager em;
	
	public PessoaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Object pessoa) {
		this.em.persist( (Pessoa) pessoa );
	}
}
