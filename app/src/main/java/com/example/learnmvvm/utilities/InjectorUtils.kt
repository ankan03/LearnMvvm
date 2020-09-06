package com.example.learnmvvm.utilities

import com.example.learnmvvm.data.FakeDatabase
import com.example.learnmvvm.data.QuoteRepository
import com.example.learnmvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}