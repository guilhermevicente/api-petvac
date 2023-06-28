package br.com.guilhermevicente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilhermevicente.domain.Especie;
import br.com.guilhermevicente.repository.EspecieRepository;

@CrossOrigin("*")
@RestController
public class EspecieController {

	@Autowired
	private EspecieRepository repository;

	@GetMapping(path = "/especies", produces = { "application/json" })
	List<Especie> get() {
		return repository.findAll();
	}
}
