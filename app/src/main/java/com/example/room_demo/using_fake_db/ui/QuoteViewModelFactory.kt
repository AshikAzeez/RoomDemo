package com.example.room_demo.using_fake_db.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.room_demo.using_fake_db.data.QuoteRepository
import com.example.room_demo.using_fake_db.data.QuoteViewModel

/**
 * User: Ashik
 * Date: 26-02-2019
 * Time: 22:50
 */
class QuoteViewModelFactory(private val quoteRepository: QuoteRepository) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return QuoteViewModel(quoteRepository) as T
    }
}
