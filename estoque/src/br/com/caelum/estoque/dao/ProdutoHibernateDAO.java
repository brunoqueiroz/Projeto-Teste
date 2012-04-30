package br.com.caelum.estoque.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.caelum.estoque.Produto;

//@Primary 
@Repository
@Transactional
public class ProdutoHibernateDAO implements ProdutoDAO {

	private final SessionFactory factory;
	
	@Autowired
	public ProdutoHibernateDAO(SessionFactory factory) {
		this.factory = factory;

	}
	
	public List<Produto> listar() {
		
		List<Produto> produtos = getSession().createQuery("from Produto").list();
		return produtos;
	}

	public void salvar(Produto produto) {
		
		getSession().save(produto);
	}

	public void alterar(Produto produto) {
		
		getSession().update(produto);
	}

	public Produto buscarPorId(Long id) {
		
		return (Produto) getSession().get(Produto.class, id);
	}

	private Session getSession() {
		
		return factory.getCurrentSession();
	}

	public Integer estoqueAtual(Produto produto) {
	
		Query query = getSession().createQuery("SELECT quantidade FROM Produto where id = :pid");
		query.setParameter("pid", produto.getId());
		return (Integer) query.uniqueResult();
	}
}
