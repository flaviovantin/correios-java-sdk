package br.com.correios.api.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.correios.api.Evento;

/**
 * @author Alexandre Gama
 * 
 * Classe que contem todas as informacoes de um Objeto Rastreado, inclusive os eventos associados ao Objeto em questao
 * 
 */
public class PacoteRastreadoDetalhes {

	/**
	 * Versão do SRO XML
	 */
	private String versao;
	
	/**
	 * Quantidade de objetos consultados
	 */
	private Integer quantidade;
	
	/**
	 * Número do objeto
	 */
	private String numero;
	
	/**
	 * Sigla do objeto solicitado
	 */
	private String sigla;
	
	/**
	 * Nome do objeto solicitado
	 */
	private String nome;
	
	/**
	 * Categoria do objeto solicitado
	 */
	private String categoria;
	
	/**
	 * Lista dos eventos que ocorreram com o objeto desejado
	 */
	private List<Evento> eventos = new ArrayList<Evento>();

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Evento> getEventos() {
		return Collections.unmodifiableList(eventos);
	}

	public void adicionaEvento(Evento evento) {
		this.eventos.add(evento);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "PacoteTracker [versao=" + versao + ", quantidade=" + quantidade + ", numero=" + numero + ", sigla="
				+ sigla + ", nome=" + nome + ", categoria=" + categoria + ", eventos=" + eventos + "]";
	}

}