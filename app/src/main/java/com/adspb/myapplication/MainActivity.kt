package com.adspb.myapplication

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity(), Fragment1.OnFragment1DataListener {

    private var editText: EditText? = null
    private var textView: TextView? = null
    private var button: Button? = null
    private var fragmentContainer: FrameLayout? = null
    private var fragmentContainer2: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        fragmentContainer = findViewById(R.id.fragmentContainer)
        fragmentContainer2 = findViewById(R.id.fragmentContainer2)

/*        button?.setOnClickListener(View.OnClickListener {
            fun onClick(view: View?) {
                // TODO some work here

            }
        })*/

        /*
        //2й вариант без использования анонимного класса
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
            }

        })*/

        //3й Для фрагментов не подходит, только для кнопки в Активити
        /*fun onMyButtonClick(view: View?) {
            // выводим сообщение
            Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show()
        }*/

        val fm: FragmentManager = supportFragmentManager

        var fragment: Fragment? = fm.findFragmentById(R.id.fragmentContainer)
        if (fragment == null) {
            fragment = Fragment1()
            fm.beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .commit()
        }

    }

    override fun onFragment1DataListener(string: String?) {
        textView?.setText(string);
    }

}


