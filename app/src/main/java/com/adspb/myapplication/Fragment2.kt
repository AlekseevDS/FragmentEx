package com.adspb.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


private var editTextFragment2: EditText? = null
private var textViewFragment2: TextView? = null
private var buttonFragment2: Button? = null

class Fragment2 : Fragment() {

    fun Fragment2() {
        // Required empty public constructor
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        editTextFragment2 = view?.findViewById(R.id.editTextFragment2)
        textViewFragment2 = view?.findViewById(R.id.textViewFragment2)
        buttonFragment2 = view?.findViewById(R.id.buttonFragment2)

        buttonFragment2?.setOnClickListener(View.OnClickListener {
            fun onClick(view: View?) {
                // Do some work here
            }
        })
        return view
    }

}