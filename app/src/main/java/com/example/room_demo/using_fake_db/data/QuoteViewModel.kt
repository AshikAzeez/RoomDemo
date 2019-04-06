package com.example.room_demo.using_fake_db.data

import androidx.lifecycle.ViewModel

/**
 * User: Ashik
 * Date: 26-02-2019
 * Time: 22:46
 */
class QuoteViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}

