package com.produtos.apiprodutos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.apiprodutos.models.Categoria;
import com.produtos.apiprodutos.repositoty.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}
	
	public Categoria findByCodigo(long codigo) {
		return repository.findByCodigo(codigo);
	}
	
	public Categoria create(Categoria categoria) {
		return repository.save(categoria);
	}
	
	public Categoria update(Categoria categoria){
		return repository.save(categoria);
	}
	
	public void delete(Categoria categoria) {
		repository.delete(categoria);
	}
}
