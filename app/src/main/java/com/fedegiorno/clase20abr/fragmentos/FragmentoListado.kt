package com.fedegiorno.clase20abr.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fedegiorno.clase20abr.R
import com.fedegiorno.clase20abr.adapters.AdapterCursos
import com.fedegiorno.clase20abr.entities.Cursos
import com.google.android.material.snackbar.Snackbar


//import android.util.Log
//import androidx.navigation.findNavController

//import com.google.android.material.floatingactionbutton.FloatingActionButton

class FragmentoListado : Fragment() {

    lateinit var v: View

    lateinit var rcvCursos: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager

    var cursos: MutableList<Cursos> = ArrayList<Cursos>()
    private lateinit var cursosListAdapter: AdapterCursos

    companion object {
        fun newInstance() = FragmentoListado()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
         }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragmento_listado, container, false)
        rcvCursos = v.findViewById(R.id.rcvCursos)
        return v
    }

    override fun onStart() {
        super.onStart()

        cursos.add(Cursos("curso 1","docente 1",1 ,"20ENE2021","20MAR2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 2","docente 2",1 ,"20ENE2021","20MAR2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 3","docente 3",1 ,"20ENE2021","20MAR2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 4","docente 4",2 ,"20ABR2021","20JUN2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 5","docente 5",2 ,"20ABR2021","20JUN2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 6","docente 6",2 ,"20ABR2021","20JUN2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 7","docente 7",3 ,"20AGO2021","20SET2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 8","docente 8",3 ,"20AGO2021","20SET2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 9","docente 9",3 ,"20AGO2021","20SET2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 10","docente 10",4 ,"20OCT2021","20DIC2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 11","docente 11",4 ,"20OCT2021","20DIC2021","08:00 a 10:00","www.miimagen.net"))
        cursos.add(Cursos("curso 12","docente 12",4 ,"20OCT2021","20DIC2021","08:00 a 10:00","www.miimagen.net"))

        rcvCursos.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        rcvCursos.layoutManager = linearLayoutManager

        cursosListAdapter = AdapterCursos(cursos) {pos ->
            onItemClick(pos)
        }

        //cursosListAdapter = AdapterCursos(cursos)
        rcvCursos.adapter = cursosListAdapter

    }

    private fun onItemClick(pos: Int): Boolean {
        Snackbar.make(v,pos.toString(), Snackbar.LENGTH_SHORT).show()
        return true
    }
}