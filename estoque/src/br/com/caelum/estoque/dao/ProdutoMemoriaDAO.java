package br.com.caelum.estoque.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.caelum.estoque.Produto;

@Repository()
public class ProdutoMemoriaDAO implements ProdutoDAO {

	private List<Produto> produtos = new ArrayList<Produto>();
	
	public ProdutoMemoriaDAO() {
		Produto produto = new Produto();
		produto.setId(1L);
		produto.setDescricao("Mac Book");
		produto.setQuantidade(40);
		
		produtos.add(produto);
	}
	

	@Override
	public void alterar(Produto produto) {
	}

	@Override
	public Produto buscarPorId(Long id) {
		return produtos.get(id.intValue() - 1);
	}

	@Override
	public List<Produto> listar() {
		return produtos;
	}

	@Override
	public void salvar(Produto produto) {
		produtos.add(produto);
	}
	
	public Integer estoqueAtual(Produto produto) {
		
		for (Produto p : produtos) {
			if (p.getId().equals(produto.getId())) {
				return p.getQuantidade();
			}
		}
		throw new IllegalArgumentException("Produto nao cadastrado");
	}
}
