package com.example.learnhilt

class QuoteService(
    val api: QuoteApi
) {
    suspend fun getRandomQuote(): Quote {
        return api.getRandomQuote()
    }
}