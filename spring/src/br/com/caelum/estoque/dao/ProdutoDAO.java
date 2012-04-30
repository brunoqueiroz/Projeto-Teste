package br.com.caelum.estoque.dao;

import java.util.List;

import br.com.caelum.estoque.Produto;

public interface ProdutoDAO {

	void salvar(Produto produto);
	void alterar(Produto produto);
	List<Produto> listar();
	Produto buscarPorId(Long id);
}
