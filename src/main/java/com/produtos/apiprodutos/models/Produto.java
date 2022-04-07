package com.produtos.apiprodutos.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable{
	
	private static final long serialVersionID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;	
	private String nome;	
	private BigDecimal quantidade;	
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "categoriaCodigo")
	private Categoria categoria;

	
	
	public Produto() {
		super();
	}

	public Produto(long codigo, String nome, BigDecimal quantidade, BigDecimal valor, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.categoria = categoria;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	
	
	
	
}
