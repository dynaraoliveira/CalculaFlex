package br.com.dynararico.calculaflex.extensions

fun Double.format(digits: Int) = String.format("%.${digits}f", this)