package br.com.jonathan.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.exerciciossb.model.entities.Produto;
import br.com.jonathan.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public @ResponseBody Produto novoProtudo(@Valid Produto produto) {
		
		produtoRepository.save(produto);
		return produto;
	}
}
