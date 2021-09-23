package com.proway.testeasy

import com.google.common.truth.Truth.assertThat
import com.proway.testeasy.model.Conta
import com.proway.testeasy.model.EnumTipoOperacao
import com.proway.testeasy.model.Operacao
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class CalculadoraTest {

    @Mock
    private lateinit var conta: Conta

    @Mock
    private lateinit var operacao: Operacao

    @Before
    fun setUp(){
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun `test soma`(){
        Mockito.`when`(conta.num1)
            .thenReturn(2)
        Mockito.`when`(conta.num2)
            .thenReturn(5)
        Mockito.`when`(conta.operacao)
            .thenReturn(operacao)
        Mockito.`when`(operacao.tipoOperacao)
            .thenReturn(EnumTipoOperacao.SOMA)

        val result =  Calculadora().calc(conta)
        assertThat(result).isEqualTo(7)

    }

    @Test
    fun `test multiplica`(){
        Mockito.`when`(conta.num1)
            .thenReturn(2)
        Mockito.`when`(conta.num2)
            .thenReturn(5)
        Mockito.`when`(conta.operacao)
            .thenReturn(operacao)
        Mockito.`when`(operacao.tipoOperacao)
            .thenReturn(EnumTipoOperacao.MULTIPLICA)

        val result =  Calculadora().calc(conta)
        assertThat(result).isEqualTo(10)
    }
}