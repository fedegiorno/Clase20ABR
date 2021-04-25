package com.fedegiorno.clase20abr.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.findNavController

import android.view.ViewGroup
import android.widget.Button
import com.fedegiorno.clase20abr.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentoLogin.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentoLogin : Fragment() {

    lateinit var v: View
    lateinit var btnAcceder: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        v=inflater.inflate(R.layout.fragment_fragmento_login, container, false)
        // Inflate the layout for this fragment
        btnAcceder = v.findViewById(R.id.btnAcceder)

        return v}

    override fun onStart() {
        super.onStart()
        btnAcceder.setOnClickListener{

            val action2 = FragmentoLoginDirections.actionFragmentoLoginToMainActivityListaCursos2()
            v.findNavController().navigate(action2)
        }
    }

}