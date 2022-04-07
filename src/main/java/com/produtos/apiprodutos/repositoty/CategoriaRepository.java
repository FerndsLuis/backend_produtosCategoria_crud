package com.produtos.apiprodutos.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apiprodutos.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	Categoria findByCodigo(long codigo);
}
