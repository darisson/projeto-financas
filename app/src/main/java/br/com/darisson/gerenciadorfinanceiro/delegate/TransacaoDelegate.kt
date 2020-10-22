package br.com.darisson.gerenciadorfinanceiro.delegate

import br.com.darisson.gerenciadorfinanceiro.model.Transacao

interface TransacaoDelegate {
    fun delegate(transacao: Transacao)
}