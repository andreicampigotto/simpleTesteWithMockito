package com.proway.testeasy.model

data class Conta(
    val nome: String,
    val num1: Int,
    val num2: Int,
    val operacao: Operacao
)

data class Operacao(
    val nome: String,
    val tipoOperacao: EnumTipoOperacao
)

enum class EnumTipoOperacao {
    SOMA,
    MULTIPLICA
}
