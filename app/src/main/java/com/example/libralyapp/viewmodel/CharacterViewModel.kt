package com.example.libralyapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.libralyapp.repository.CharacterRepo
import com.example.libralyapp.retrofit.Character  // Ensure you import the right Character class
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CharacterViewModel(val characterRepo: CharacterRepo): ViewModel() {

    private val _state = MutableStateFlow(emptyList<Character>())
    val state: StateFlow<List<Character>>
        get() = _state

    init {
        viewModelScope.launch {
            val characters = characterRepo.getCharacters()
            _state.value = characters
        }
    }
}
