package br.com.guilhermevicente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilhermevicente.domain.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Integer> {

}
