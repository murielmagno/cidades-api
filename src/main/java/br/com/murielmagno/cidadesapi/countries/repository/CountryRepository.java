package br.com.murielmagno.cidadesapi.countries.repository;

import br.com.murielmagno.cidadesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
