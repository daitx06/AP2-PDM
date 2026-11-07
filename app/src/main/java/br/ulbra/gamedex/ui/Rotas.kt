package br.ulbra.gamedex.ui

import kotlinx.serialization.Serializable

@Serializable
object Lista

@Serializable
data class Detalhe(val jogoId: Int)