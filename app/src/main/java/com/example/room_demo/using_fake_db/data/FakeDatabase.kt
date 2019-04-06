package com.example.room_demo.using_fake_db.data

/**
 * User: Ashik
 * Date: 26-02-2019
 * Time: 21:39
 */

/*This is Just considered as DB class*/
class FakeDatabase private constructor() {


    var quoteDao = FakeQuoteDao()
        private set


    companion object {
        @Volatile
        private var instance: FakeDatabase? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: FakeDatabase().also { instance = it }
        }


    }
}
