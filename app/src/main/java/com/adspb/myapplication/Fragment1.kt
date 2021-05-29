package com.adspb.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


private var editTextFragment1: EditText? = null
private var textViewFragment1: TextView? = null
private var buttonFragment1: Button? = null

class Fragment1 : Fragment() {

    fun Fragment1() {
        // Required empty public constructor
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_1, container, false)

        editTextFragment1 = view?.findViewById(R.id.editTextFragment1)
        textViewFragment1 = view?.findViewById(R.id.textViewFragment1)
        buttonFragment1 = view?.findViewById(R.id.buttonFragment1)

        buttonFragment1?.setOnClickListener {
            val S = editTextFragment1?.text.toString()
            mListener?.onFragment1DataListener(S)
        }
        return view
    }

    //В фрагменте определим интерфейс слушателя команд от нашего фрагмента.
    interface OnFragment1DataListener {
        fun onFragment1DataListener(string: String?)
    }

    private var mListener: OnFragment1DataListener? = null

// проверим есть ли у вызывающей фрагмент активности наш интерфейс. Если нет, то вызовем RuntimeException,
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mListener = if (context is OnFragment1DataListener) {
            context
        } else {
            throw RuntimeException("$context must implement OnFragment1DataListener")
        }
    }



}



