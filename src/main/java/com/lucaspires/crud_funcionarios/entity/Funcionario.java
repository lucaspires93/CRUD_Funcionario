package com.lucaspires.crud_funcionarios.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "funcionario")
@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;

    @Column (name = "nome")
    private String nome;
    @Column (name = "cargo")
    private String cargo;
    @Column(name = "setor")
    private String setor;
    @Column(name = "dataAdmissao")
    private LocalDate dataAdmissao;
    @Column(name = "dataDemissao")
    private LocalDate dataDemissao;


}
