package com.suslicketeam.musicinstruments.model

data class Instrument(
    val id: Int,
    val name: String,
    val description: String,
    val type: String,
    val price: Double
)