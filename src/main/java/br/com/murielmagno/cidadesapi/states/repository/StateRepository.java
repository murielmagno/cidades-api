package br.com.murielmagno.cidadesapi.states.repository;


import br.com.murielmagno.cidadesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}