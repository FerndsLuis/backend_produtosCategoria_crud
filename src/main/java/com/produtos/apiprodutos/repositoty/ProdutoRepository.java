package com.produtos.apiprodutos.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apiprodutos.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findById(long id);
}
