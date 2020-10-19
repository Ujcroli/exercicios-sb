package br.com.jonathan.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.jonathan.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

	
}
