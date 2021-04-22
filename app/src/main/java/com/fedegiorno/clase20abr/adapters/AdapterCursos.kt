package com.fedegiorno.clase20abr.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.fedegiorno.clase20abr.R
import com.fedegiorno.clase20abr.entities.Cursos

class AdapterCursos (
        private var cursosList: MutableList<Cursos>,
        val onItemClick: (Int) -> Boolean
): RecyclerView.Adapter<AdapterCursos.CursosHolder>()

{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CursosHolder {
        //Voy a buscar el item item_Curso.xml
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_curso,parent,false)
        return (AdapterCursos.CursosHolder(view))
    }

    override fun onBindViewHolder(holder: CursosHolder, position: Int) {
        //Sirve para unir la vista con los datos
        holder.setName(cursosList[position].nombreCurso)

        holder.getCardLayout().setOnLongClickListener(){
            onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        //Sirve para que el adaptador sepa cual es el numero de elementos de la lista
        return cursosList.size
    }

    class CursosHolder(v: View) : RecyclerView.ViewHolder(v) {
    private var view: View

    init {
        this.view = v
    }

    fun setName(name: String) {
        val txt: TextView = view.findViewById(R.id.txtNombreCurso)
        txt.text = name
    }

    fun getCardLayout (): CardView {
        return view.findViewById(R.id.crvItemCurso)
    }
//    fun setCohorte(cohorte: String) {
//        val txt: TextView = view.findViewById(R.id.txtCohorte)
//        txt.text = cohorte
//    }
//
//    fun setCIIE(CIIE: String) {
//        val txt: TextView = view.findViewById(R.id.txtCIIE)
//        txt.text = CIIE
//    }
//

//
//        fun getImageView () : ImageView {
//            return view.findViewById(R.id.img_item)
//        }

    }

}