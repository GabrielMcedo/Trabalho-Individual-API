package br.org.serratec.Trabalho.Individual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.org.serratec.Trabalho.Individual.entity.Livro;


public interface LivroRepository extends JpaRepository<Livro, Long> {
}
