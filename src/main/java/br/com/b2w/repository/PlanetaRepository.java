package br.com.b2w.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.b2w.model.Planeta;

public interface PlanetaRepository extends MongoRepository<Planeta, String> {

	List<Planeta> findByNomeLikeIgnoreCase(String nome);

}