package com.example.room_demo.using_fake_db.utils

import com.example.room_demo.using_fake_db.data.FakeDatabase
import com.example.room_demo.using_fake_db.data.QuoteRepository
import com.example.room_demo.using_fake_db.ui.QuoteViewModelFactory

/**
 * User: Ashik
 * Date: 26-02-2019
 * Time: 22:54
 */
object InjectUtils {

    fun provideQuoteViewModelFactory(): QuoteViewModelFactory {
        val quoteRepository: QuoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuoteViewModelFactory(quoteRepository)
    }
}
