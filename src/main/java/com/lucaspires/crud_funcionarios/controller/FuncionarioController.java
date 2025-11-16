package com.lucaspires.crud_funcionarios.controller;

import com.lucaspires.crud_funcionarios.entity.Funcionario;
import com.lucaspires.crud_funcionarios.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {


    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public Funcionario criarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.salvarFuncionario(funcionario);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarFuncionarioPorId(@PathVariable Integer id) {
        Funcionario funcionario = funcionarioService.buscarPorId(id);
        return ResponseEntity.ok(funcionario);
    }

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listarFuncionarios();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFuncionarioPorId(@PathVariable Integer id) {
        funcionarioService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarFuncionarioId(@RequestParam Integer id, @RequestBody Funcionario funcionario) {
        funcionarioService.atualizarFuncionarioPorId(id, funcionario);
        return ResponseEntity.ok().build();
    }
}
