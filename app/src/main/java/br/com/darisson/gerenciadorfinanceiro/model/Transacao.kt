package br.com.darisson.gerenciadorfinanceiro.model

import java.math.BigDecimal
import java.util.Calendar

class Transacao(
    val valor: BigDecimal,
    val categoria: String = "Indefinida",
    val tipo: Tipo,
    val data: Calendar = Calendar.getInstance(),
    val descricao: String = "",
    val pago: Boolean = false,
    val recebido: Boolean = false
)