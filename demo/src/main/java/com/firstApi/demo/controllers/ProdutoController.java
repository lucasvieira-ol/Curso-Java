package com.firstApi.demo.controllers;

import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstApi.demo.model.entities.Produto;
import com.firstApi.demo.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public Produto salvarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping("/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}

	@GetMapping("/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}

	@GetMapping("/pagina/{numeroPagina}/{qtdPorPagina}")
	public Page<Produto> obterProdutoPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdPorPagina) {
		Pageable page = PageRequest.of(numeroPagina, qtdPorPagina);

		return produtoRepository.findAll(page);
	}

	/*
	 * @PutMapping public Produto alterarProduto(Produto produto) { return
	 * produtoRepository.save(produto); }
	 */

	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
