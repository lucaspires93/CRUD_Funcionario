package com.lucaspires.crud_funcionarios.service;

import com.lucaspires.crud_funcionarios.entity.Funcionario;
import com.lucaspires.crud_funcionarios.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;


@Service
public class FuncionarioService {


    private final FuncionarioRepository repo;

    public FuncionarioService(FuncionarioRepository repo) {
        this.repo = repo;
    }

    public void salvarFuncionario(Funcionario funcionario){
        repo.saveAndFlush(funcionario);
    }

    public Funcionario buscarPorId(Integer id){
        return repo.findById(id).orElseThrow(
                () -> new RuntimeException("Funcionario não econtrado"));
    }

    public void deletarPorId(Integer id){
        repo.deleteById(id);
    }

    public void atualizarFuncionarioPorId(Integer id, Funcionario funcionario){
        Funcionario funcionarioEntity = repo.findById(id).orElseThrow(
                () -> new RuntimeException("Funcionario não econtrado"));
        Funcionario funcionarioAtualizado = Funcionario.builder()
                .nome(funcionario.getNome() != null ? funcionario.getNome() : funcionarioEntity.getNome())
                .cargo(funcionario.getCargo() != null ? funcionario.getCargo() : funcionarioEntity.getCargo())
                .setor(funcionario.getSetor() != null ? funcionario.getSetor() : funcionarioEntity.getSetor())
                .dataAdmissao(funcionario.getDataAdmissao() != null ? funcionario.getDataAdmissao() : funcionarioEntity.getDataAdmissao())
                .dataDemissao(funcionario.getDataDemissao() != null ? funcionario.getDataDemissao() : funcionarioEntity.getDataDemissao())
                .id(funcionarioEntity.getId())
                .build();
        repo.saveAndFlush(funcionarioAtualizado);
    }
}
