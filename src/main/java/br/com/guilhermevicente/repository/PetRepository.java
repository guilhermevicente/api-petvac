package br.com.guilhermevicente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilhermevicente.domain.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {

}
