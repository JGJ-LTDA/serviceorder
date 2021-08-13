package com.algaworks.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

    BUSINESS_ERROR("Violação de regra de negócio"),
    ENTITY_IN_USE( "Entidade em uso"),
    MESSAGE_ERROR( "Mensagem nao interpretada corretamente"),
    PARAMETER_INVALID( "Parâmetro inválido"),
    RESOURCE_NOT_FOUND( "Recurso não encontrado"),
    SYSTEM_ERROR( "Erro de sistema"),
    INVALID_DATA( "Dados inválidos");

    private String title;
    private String uri;

    ProblemType(String title) {
        this.uri = "https://github.com/JGJ-LTDA/serviceorder/issues/";
        this.title = title;
    }

}
