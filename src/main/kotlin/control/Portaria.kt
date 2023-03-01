package control

import business.ConvidadoBusiness
import entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()
    init {
        println("Bem-vindo(a) a portaria!")
        println(this.controle())
    }
    private fun controle(): String{
        val idade = Console.readInt("Qual sua idade? ")
        val convidado = Convidado(idade =  idade)

        if (!convidadoBusiness.maiorDeIdade(convidado.idade)){
            return "Negado. Menores de idade não são permitidos."
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite?")
        if (!convidadoBusiness.tipoValido(convidado.tipo)) return  "Negado. Convidado inválido."

        convidado.codigo = Console.readString("Qual é o código do convite?")
        if (!convidadoBusiness.convidadoValido(convidado)) return  "Negado. Convidado inválido."

        return "Welcome :)"
    }
}


// Função portaria usada para consulta
/*
fun portaria() {
//    print("Qual sua idade? ")
//    val idade = readLine()
//    if (idade != null && idade != "") {
//        if (idade.toInt() < 18) {
//            println("Negado. Menores de idade não são permitidos.")
//            return
//        }
//    }
    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()
        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. entity.Convidado inválido.")
            return
        }
        print("Qual o código do convite? ")
        var codigo = readLine()
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. entity.Convidado inválido")
            }
        }
    }
}
* */