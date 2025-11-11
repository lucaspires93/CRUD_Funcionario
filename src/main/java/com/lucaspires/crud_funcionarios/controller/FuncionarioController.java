package com.lucaspires.crud_funcionarios.controller;

import com.lucaspires.crud_funcionarios.entity.Funcionario;
import com.lucaspires.crud_funcionarios.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")
@RequiredArgsConstructor
public class FuncionarioController {


    private final FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<Void> salvarFUncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.salvarFuncionario(funcionario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Funcionario> buscarFuncionarioPoId(@RequestParam Integer id) {
        return ResponseEntity.ok(funcionarioService.buscarPorId(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarFuncionarioPorId(@RequestParam Integer id){
        funcionarioService.deletarPorId(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarFuncionarioId(@RequestParam Integer id, @RequestBody Funcionario funcionario){
        funcionarioService.atualizarFuncionarioPorId(id, funcionario);
        return ResponseEntity.ok().build();
    }
}
