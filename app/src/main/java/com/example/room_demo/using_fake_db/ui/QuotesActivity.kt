package com.example.room_demo.using_fake_db.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.room_demo.R
import com.example.room_demo.using_fake_db.data.Quote
import com.example.room_demo.using_fake_db.data.QuoteViewModel
import com.example.room_demo.using_fake_db.utils.InjectUtils
import kotlinx.android.synthetic.main.activity_quotes.*

class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initUi()
    }

    private fun initUi() {
        val factoey = InjectUtils.provideQuoteViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factoey).get(QuoteViewModel::class.java)
        viewModel.getQuotes().observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote ->
                stringBuilder.append("$quote\n\n")

            }
            textView_quotes.text = stringBuilder.toString()
        })
        btn_add_quote.setOnClickListener {
            val quote = Quote(editText_quote.text.toString(), editText_author.text.toString())
            viewModel.addQuote(quote)
            editText_author.setText("")
            editText_quote.setText("")

        }
    }
}
