package com.ahmed.about_me

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.ahmed.about_me.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.done.setOnClickListener {
            addNickName(it)
        }

    }

    private fun addNickName(view: View) {
        binding.textshow.text =binding.edittext.text
        binding.edittext.visibility=View.GONE
        binding.done.visibility=View.GONE
        binding.textshow.visibility=View.VISIBLE
        //hide the keyboard
        val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        //will hide it when I click view(Button)
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}