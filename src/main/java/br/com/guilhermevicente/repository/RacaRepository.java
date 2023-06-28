package br.com.guilhermevicente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilhermevicente.domain.Raca;

public interface RacaRepository extends JpaRepository<Raca, Integer> {

}
