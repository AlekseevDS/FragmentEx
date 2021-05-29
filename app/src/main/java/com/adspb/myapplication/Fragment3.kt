package com.adspb.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


private var editTextFragment3: EditText? = null
private var textViewFragment3: TextView? = null
private var buttonFragment3: Button? = null

class Fragment3 : Fragment() {

    fun Fragment3() {
        // Required empty public constructor
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        editTextFragment3 = view?.findViewById(R.id.editTextFragment3)
        textViewFragment3 = view?.findViewById(R.id.textViewFragment3)
        buttonFragment3 = view?.findViewById(R.id.buttonFragment3)

        buttonFragment3?.setOnClickListener(View.OnClickListener {
            fun onClick(view: View?) {
                // Do some work here
            }
        })
        return view
    }

}