package com.firstApi.demo.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.firstApi.demo.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

	//@Query("SELECT p FROM produto p WHERE p.nome LIKE %:nome%")
	//public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
