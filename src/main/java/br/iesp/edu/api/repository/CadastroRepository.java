package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CadastroRepository
        extends JpaRepository<Cadastro, Integer> {

}
