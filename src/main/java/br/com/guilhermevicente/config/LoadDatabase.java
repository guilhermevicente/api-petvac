package br.com.guilhermevicente.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.guilhermevicente.domain.Especie;
import br.com.guilhermevicente.domain.Pet;
import br.com.guilhermevicente.domain.Raca;
import br.com.guilhermevicente.repository.EspecieRepository;
import br.com.guilhermevicente.repository.PetRepository;
import br.com.guilhermevicente.repository.RacaRepository;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(final EspecieRepository especieRepository, final RacaRepository racaRepository,
			final PetRepository petRepository) {

		return args -> {
			final Especie especie = new Especie(1, "Cachorro");
			log.info("Preloading Especie... " + especieRepository.save(especie));
			log.info("Preloading Especie... " + especieRepository.save(new Especie(2, "Gato")));

			final Raca raca = new Raca(11, "Dachshund", 1);
			log.info("Preloading Raca... " + racaRepository.save(raca));
			log.info("Preloading Raca... " + racaRepository.save(new Raca(12, "Buldogue", 1)));
			log.info("Preloading Raca... " + racaRepository.save(new Raca(21, "Angorá", 2)));
			log.info("Preloading Raca... " + racaRepository.save(new Raca(22, "Siamês", 2)));

			log.info("Preloading Pet... " + petRepository.save(new Pet(1, "Lisa", "2023-06-04", raca, especie)));
			log.info("Preloading Pet... " + petRepository.save(new Pet(2, "Boris", "2023-06-05", raca, especie)));
		};
	}
}