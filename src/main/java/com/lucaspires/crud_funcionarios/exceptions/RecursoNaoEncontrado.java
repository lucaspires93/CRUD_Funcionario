package com.lucaspires.crud_funcionarios.exceptions;

public class RecursoNaoEncontrado extends RuntimeException{

    public RecursoNaoEncontrado(String mensagem){
        super(mensagem);
    }
}
