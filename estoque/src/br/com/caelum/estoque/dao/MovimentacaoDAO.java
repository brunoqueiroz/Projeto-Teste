package br.com.caelum.estoque.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.caelum.estoque.Movimentacao;

@Repository
public class MovimentacaoDAO {

	private final SessionFactory factory;
	
	@Autowired
	public MovimentacaoDAO(SessionFactory factory) {
		this.factory = factory;

	}
	
	public void salvar(Movimentacao movimentacao) {
		
		factory.getCurrentSession().save(movimentacao);
	}
}
