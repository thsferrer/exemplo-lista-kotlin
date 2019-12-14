package com.example.projetolista

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contatos)
        var lista = findViewById(R.id.lstcontatos) as ListView
        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked item : $position", Toast.LENGTH_SHORT).show()
        }

    }
    companion object {
        internal val contatos = arrayOf("Alline", "Lucas", "Rafael", "Gabriela", "Silvana")
    }
}
