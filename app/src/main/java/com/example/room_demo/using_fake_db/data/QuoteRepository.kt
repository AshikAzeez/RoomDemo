package com.example.room_demo.using_fake_db.data

/**
 * User: Ashik
 * Date: 26-02-2019
 * Time: 22:34
 */
class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {
    companion object {
        @Volatile
        private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) = instance ?: synchronized(this) {
            instance ?: QuoteRepository(quoteDao).also { instance = it }
        }
    }

    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()
}
