package com.myoenoes.myfirstkotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button_submit_onClick(view: View) {
        val namaEditText = findViewById<EditText>(R.id.edit_text_nama)
        val nama = namaEditText.text.toString()
        val toast = Toast.makeText(applicationContext, nama, Toast.LENGTH_SHORT)

        toast.show()
    }
}