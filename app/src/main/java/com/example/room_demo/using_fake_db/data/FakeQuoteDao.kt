package com.example.room_demo.using_fake_db.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * User: Ashik
 * Date: 26-02-2019
 * Time: 21:28
 */
class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotesLiveData = MutableLiveData<List<Quote>>()

    init {
        quotesLiveData.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotesLiveData.value = quoteList
    }

    fun getQuotes() = quotesLiveData as LiveData<List<Quote>>
}
