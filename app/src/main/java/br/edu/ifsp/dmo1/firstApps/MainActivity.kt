package br.edu.ifsp.dmo1.firstApps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), OnClickListener {

    val dollar_value = 5.50

    private lateinit var mEditText: EditText
    private lateinit var ToDollarButton: Button
    private lateinit var ToRealButton: Button
    private lateinit var outputextview: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //puxar todas as referencias no construtor, o lance do ciclo de vida do android
        //comentario de grosso modo,so para lembrete

        //referenciando via codigo

        mEditText.findViewById<View>(R.id.edittext_value)
        ToDollarButton.findViewById<View>(R.id.convert_toDollar)
        ToRealButton.findViewById<View>(R.id.convert_toDollar)
        outputextview.findViewById<View>(R.id.textview_result)

        ConfigClickButton()
    }

    private fun ConfigClickButton(){

        ToRealButton.setOnClickListener(this)
        ToDollarButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v == ToDollarButton) {
            val value = mEditText.text.toString().toDouble() / dollar_value
            outputextview.text = "U$ $value"
        }else{
            if(v == ToRealButton){
                val value =  mEditText.text.toString().toDouble() * dollar_value
                outputextview.text = "R$ $value"
            }
        }
    }


}