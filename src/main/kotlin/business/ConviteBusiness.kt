package business

class ConviteBusiness {
    fun tipoValido(tipoConvite: String) = (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")
    fun codigoValido(codigo: String, tipoConvite: String): Boolean {
        return (tipoConvite == "comum" && codigo.startsWith("xt")) ||
                ((tipoConvite == "premium"||tipoConvite == "luxo")  && codigo.startsWith("xl"))
    }
}