package com.example.room_demo.using_fake_db.data

/**
 * User: Ashik
 * Date: 26-02-2019
 * Time: 00:25
 */
data class Quote(
    val quoteText: String,
    val author: String
) {
    override fun toString(): String {

        return "$quoteText - $author"
    }
}
