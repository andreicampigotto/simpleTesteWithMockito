package com.proway.testeasy

import com.proway.testeasy.model.Conta
import com.proway.testeasy.model.EnumTipoOperacao

class Calculadora {

    fun calc(conta: Conta): Any {
        if (conta.operacao.tipoOperacao == EnumTipoOperacao.SOMA) {
            return conta.num1 + conta.num2
        } else
            return conta.num1 * conta.num2
    }
}