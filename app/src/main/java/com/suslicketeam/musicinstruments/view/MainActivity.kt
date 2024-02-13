package com.suslicketeam.musicinstruments.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.suslicketeam.musicinstruments.InstrumentsAdapter
import com.suslicketeam.musicinstruments.databinding.ActivityMainBinding
import com.suslicketeam.musicinstruments.viewmodel.InstrumentsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: InstrumentsViewModel
    private lateinit var adapter: InstrumentsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = InstrumentsViewModel()

        adapter = InstrumentsAdapter(listOf())
        binding.instrumentsRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.instrumentsRecyclerView.adapter = adapter

        viewModel.instruments.observe(this, Observer { instruments ->
            adapter.instruments = instruments
            adapter.notifyDataSetChanged()
        })

        viewModel.loadInstruments()
    }
}
