package com.example.myapplicationrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplicationrecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter= Adapter(getList())
    }

    private fun getList()= listOf (
    "Alice Alves",
    "Beatriz Barbosa",
    "Carla Costa",
    "Diego Dias",
    "Erica Evangelista",
    "Felipe Fernandes",
    "Gabriela Gomes",
    "Hugo Henriques",
    "Isabela Inácio",
    "João Júnior",
    "Karina Kozlowski",
    "Leonardo Lemos",
    "Mariana Melo",
    "Natalia Nascimento",
    "Otávio Oliveira",
    "Paula Pereira",
    "Rafael Ramos",
    "Sofia Santos",
    "Thiago Torres",
    "Ulisses Uchoa",
    "Vitoria Vaz",
    "Wellington Wanderley",
    "Xavier Xavier",
    "Yasmin Yanes",
    "Zacarias Zanin")




}