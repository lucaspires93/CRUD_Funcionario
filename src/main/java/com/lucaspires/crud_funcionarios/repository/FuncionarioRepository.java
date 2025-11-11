package com.lucaspires.crud_funcionarios.repository;

import com.lucaspires.crud_funcionarios.entity.Funcionario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    Optional<Funcionario> findById(Integer id);

    @Transactional
    void deleteById(Integer id);
}
