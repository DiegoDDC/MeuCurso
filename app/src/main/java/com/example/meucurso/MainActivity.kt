package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnConhecaCurso = findViewById<Button>(R.id.btnConhecaCurso)
        val btnDisciplinas = findViewById<Button>(R.id.btnDisciplinas)

        btnConhecaCurso.setOnClickListener {
            startActivity(Intent(this, SobreCursoActivity::class.java))
        }
        btnDisciplinas.setOnClickListener {
            startActivity(Intent(this, DisciplinasActivity::class.java))
        }
    }
}