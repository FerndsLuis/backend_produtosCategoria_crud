package com.produtos.apiprodutos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.produtos.apiprodutos.repositoty.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.produtos.apiprodutos.models.Produto;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST PRODUTOS")
@CrossOrigin(origins = "*")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Lista todos os produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{codigo}")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Lista produto por codigo")
	public Produto listaProdutoId(@PathVariable(value="codigo") long codigo){
		return produtoRepository.findByCodigo(codigo);
	} 
	
	@PostMapping("/produto")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Salva um produto")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value = "Deleta um produto")
	public void deletaProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Atualiza um produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
}
