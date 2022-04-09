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

import com.produtos.apiprodutos.models.Categoria;
import com.produtos.apiprodutos.service.CategoriaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST CATEGORIA")
@CrossOrigin(origins = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/categoria")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Lista todas as categorias")
	public List<Categoria> findAll(){
		return categoriaService.findAll();
	}
	
	@GetMapping("/categoria/{codigo}")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Lista categoria por codigo")
	public Categoria listaCategoriaId(@PathVariable(value="codigo") long codigo){
		return categoriaService.findByCodigo(codigo);
	}
	
	@PostMapping("/categoria")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Salva uma categoria")
	public Categoria salvaCategoria(@RequestBody Categoria categoria) {
		return categoriaService.create(categoria);
	}
	
	@DeleteMapping("/categoria")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value = "Deleta uma categoria")
	public void deletaCategoria(@RequestBody Categoria categoria) {
		categoriaService.delete(categoria);
	}
	
	@PutMapping("/categoria")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Atualiza uma categoria")
	public Categoria atualizaCategoria(@RequestBody Categoria categoria) {
		return categoriaService.create(categoria);
	}
}
