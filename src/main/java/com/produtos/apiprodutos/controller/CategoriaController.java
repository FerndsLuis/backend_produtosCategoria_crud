package com.produtos.apiprodutos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apiprodutos.models.Categoria;
import com.produtos.apiprodutos.models.Produto;
import com.produtos.apiprodutos.repositoty.CategoriaRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class CategoriaController {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping("/categoria")
	public List<Categoria> findAll(){
		return categoriaRepository.findAll();
	}
	
	@GetMapping("/categoria/{codigo}")
	public Categoria listaCategoriaId(@PathVariable(value="codigo") long codigo){
		return categoriaRepository.findByCodigo(codigo);
	}
	
	@PostMapping("/categoria")
	public Categoria salvaCategoria(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	@DeleteMapping("/categoria")
	public void deletaCategoria(@RequestBody Categoria categoria) {
		categoriaRepository.delete(categoria);
	}
	
	@PutMapping("/categoria")
	public Categoria atualizaCategoria(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
