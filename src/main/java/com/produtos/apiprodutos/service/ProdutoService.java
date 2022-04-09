package com.produtos.apiprodutos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.apiprodutos.models.Produto;
import com.produtos.apiprodutos.repositoty.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> findAll(){
		return repository.findAll();
	}
	
	public Produto findByCodigo(long codigo) {
		return repository.findByCodigo(codigo);
	}
	
	public Produto create(Produto produto) {
		return repository.save(produto);
	}
	
	public Produto update(Produto produto){
		return repository.save(produto);
	}
	
	public void delete(Produto produto) {
		repository.delete(produto);
	}
}
