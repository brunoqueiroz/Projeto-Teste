package br.com.caelum.estoque;

import java.util.List;
import java.util.Properties;

public class SpringBean {

	private String nome;
	private Integer quantidade;
	private Properties propriedades;
	private List<String> nomes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Properties getPropriedades() {
		return propriedades;
	}

	public void setPropriedades(Properties propriedades) {
		this.propriedades = propriedades;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
}
