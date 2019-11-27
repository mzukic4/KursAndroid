package com.example.myapplication.model

data class Pitanje(var textPitanja: String,
                   var daLiJeTacno: Boolean,
                   var daLiJeOdgovoreno: Boolean = false
)