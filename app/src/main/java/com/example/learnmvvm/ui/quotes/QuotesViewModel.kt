package com.example.learnmvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.learnmvvm.data.Quote
import com.example.learnmvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}