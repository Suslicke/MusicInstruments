package com.suslicketeam.musicinstruments.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.suslicketeam.musicinstruments.model.Instrument

class InstrumentsViewModel : ViewModel() {

    private val _instruments = MutableLiveData<List<Instrument>>()

    val instruments: LiveData<List<Instrument>> get() = _instruments

    fun loadInstruments() {
        _instruments.value = listOf(
            Instrument(1, "Гитара", "Описание гитары", "Guitar",1000.0),
            Instrument(1, "Гитара", "Описание гитары", "Guitar",1000.0),
            Instrument(1, "Гитара", "Описание гитары", "Guitar",1000.0),
            Instrument(1, "Гитара", "Описание гитары", "Guitar",1000.0),
            Instrument(1, "Гитара", "Описание гитары", "Guitar",1000.0),
        )
    }
}
