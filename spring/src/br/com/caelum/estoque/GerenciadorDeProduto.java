package br.com.caelum.estoque;

import java.sql.Connection;
import java.util.List;

import br.com.caelum.estoque.dao.ProdutoDAO;

public class GerenciadorDeProduto {

	private ProdutoDAO produtoDAO;
	private Connection con;

	//public GerenciadorDeProduto(ProdutoDAO produtoDAO) {
	//	this.produtoDAO = produtoDAO;
	//}

	public GerenciadorDeProduto(Connection con) {
		this.con = con;
	}
	
	public Connection getCon() {
		return con;
	}

	public void setProdutoDAO(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}

	public void novoProduto(Produto produto) {

		System.out.println("Salvando produto");
		this.produtoDAO.salvar(produto);
	}

	public List<Produto> getProdutos() {

		return produtoDAO.listar();
	}
}
