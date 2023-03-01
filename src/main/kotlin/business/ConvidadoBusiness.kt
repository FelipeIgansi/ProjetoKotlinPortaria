package business

import entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipoConvite: String) = (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")

    fun convidadoValido(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> codigoComecaCom(convidado,"xt")
        "premium", "luxo" -> codigoComecaCom(convidado,"xl")
        else -> false
    }

    fun maiorDeIdade(idade: Int) = idade > 18
}
fun codigoComecaCom(convidado: Convidado, codigo: String) = convidado.codigo.startsWith(codigo)