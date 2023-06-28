package br.com.guilhermevicente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilhermevicente.domain.Raca;
import br.com.guilhermevicente.repository.RacaRepository;

@CrossOrigin("*")
@RestController
public class RacaController {

	@Autowired
	private RacaRepository repository;

	@GetMapping(path = "/racas", produces = { "application/json" })
	List<Raca> get() {
		return repository.findAll();
	}
}
