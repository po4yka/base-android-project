package com.po4yka.baseproject.ui.screen.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

sealed class UiState {
    object OnLoading: UiState()
    data class OnNext<D>(val data: D): UiState()
    data class OnFailed(val message: String)
}

abstract class BaseViewModel: ViewModel() {

    protected val io = CoroutineScope(Dispatchers.IO + Job())
    protected val ui = CoroutineScope(Dispatchers.Main + Job())

    override fun onCleared() {
        super.onCleared()
        if (io.coroutineContext.isActive) io.coroutineContext.cancel()
        if (ui.coroutineContext.isActive) ui.coroutineContext.cancel()
    }
}
