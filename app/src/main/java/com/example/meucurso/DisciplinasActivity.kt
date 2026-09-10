package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisciplinasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish()
        }

        findViewById<TextView>(R.id.itemProgramacao).setOnClickListener {
            abrirDetalhes(
                nome = "Programação",
                cargaHoraria = "80 horas",
                modalidade = "Presencial",
                descricao = "Fundamentos de lógica e estruturas de programação direto da fonte.",
                professor = "Neo",
                preRequisito = "Nenhum"
            )
        }

        findViewById<TextView>(R.id.itemBancoDeDados).setOnClickListener {
            abrirDetalhes(
                nome = "Banco de Dados",
                cargaHoraria = "60 horas",
                modalidade = "Presencial",
                descricao = "Modelagem, SQL e extração rápida de dados de servidores centrais.",
                professor = "Trinity",
                preRequisito = "Programação"
            )
        }

        findViewById<TextView>(R.id.itemEngenhariaSoftware).setOnClickListener {
            abrirDetalhes(
                nome = "Engenharia de Software",
                cargaHoraria = "60 horas",
                modalidade = "Híbrido",
                descricao = "Processos, metodologias ágeis e arquitetura de sistemas em Zion.",
                professor = "Morpheus",
                preRequisito = "Programação"
            )
        }

        findViewById<TextView>(R.id.itemDesenvolvimentoWeb).setOnClickListener {
            abrirDetalhes(
                nome = "Desenvolvimento Web",
                cargaHoraria = "70 horas",
                modalidade = "Presencial",
                descricao = "Construção de aplicações web e gerenciamento de redes de comunicação.",
                professor = "Tank",
                preRequisito = "Programação"
            )
        }

        findViewById<TextView>(R.id.itemDesenvolvimentoMobile).setOnClickListener {
            abrirDetalhes(
                nome = "Desenvolvimento Mobile",
                cargaHoraria = "80 horas",
                modalidade = "Presencial",
                descricao = "Desenvolvimento de aplicativos capazes de rodar em qualquer dispositivo da resistência.",
                professor = "Oráculo",
                preRequisito = "Desenvolvimento Web"
            )
        }

        findViewById<TextView>(R.id.itemInteligenciaArtificial).setOnClickListener {
            abrirDetalhes(
                nome = "Inteligência Artificial",
                cargaHoraria = "60 horas",
                modalidade = "Presencial",
                descricao = "Introdução a algoritmos de replicação autônoma e programas controladores.",
                professor = "Agente Smith",
                preRequisito = "Estrutura de Dados"
            )
        }
    }

    private fun abrirDetalhes(
        nome: String,
        cargaHoraria: String,
        modalidade: String,
        descricao: String,
        professor: String,
        preRequisito: String
    ) {
        val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
        intent.putExtra("NOME_DISCIPLINA", nome)
        intent.putExtra("CARGA_HORARIA", cargaHoraria)
        intent.putExtra("MODALIDADE", modalidade)
        intent.putExtra("DESCRICAO", descricao)
        intent.putExtra("PROFESSOR", professor)
        intent.putExtra("PRE_REQUISITO", preRequisito)
        startActivity(intent)
    }
}