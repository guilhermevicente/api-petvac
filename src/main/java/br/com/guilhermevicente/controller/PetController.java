package br.com.guilhermevicente.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.guilhermevicente.domain.Pet;
import br.com.guilhermevicente.repository.PetRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/pets")
public class PetController {

	@Autowired
	private PetRepository repository;

	@GetMapping
	List<Pet> get() {
		return repository.findAll();
	}

	@PostMapping
	Pet post(@RequestBody final Pet pet) {
		return repository.save(pet);
	}

	@PutMapping(path = "/{id}")
	Pet put(@PathVariable final Integer id, @RequestBody final Pet novo) {
		final Optional<Pet> petOpt = repository.findById(id);
		if (petOpt.isPresent()) {
			final Pet pet = petOpt.get();
			pet.setDataNascimento(novo.getDataNascimento());
			pet.setEspecie(novo.getEspecie());
			pet.setRaca(novo.getRaca());
			pet.setNome(novo.getNome());

			return repository.save(pet);
		}

		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping(path = "/{id}")
	void put(@PathVariable final Integer id) {
		final Optional<Pet> petOpt = repository.findById(id);
		if (petOpt.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		repository.deleteById(id);
	}
}
