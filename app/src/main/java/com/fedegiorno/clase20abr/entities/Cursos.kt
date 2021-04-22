package com.fedegiorno.clase20abr.entities

class Cursos(nombreCurso: String?,
             docente: String?,
             cohorte: Int?,
             inicio: String?,
             fin: String?,
             horario: String?,
             urlImage: String?) {

    var nombreCurso: String = ""
    var docente: String = ""
    var cohorte: Int = 0
    var inicio: String = ""
    var fin: String = ""
    var horario: String = ""
    var urlImage: String = ""

    class Constants {
        companion object {
            val tipoInicial = "INICIAL"
            val tipoPrimaria = "PRIMARIA"
            val tipoSecundaria = "SECUNDARIA"
        }
    }

    init {
        this.nombreCurso = nombreCurso!!
        this.docente = docente!!
        this.cohorte = cohorte!!
        this.inicio = inicio!!
        this.fin = fin!!
        this.horario = horario!!
        this.urlImage = urlImage!!
    }
}