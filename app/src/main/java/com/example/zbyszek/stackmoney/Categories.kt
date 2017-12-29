package com.example.zbyszek.stackmoney

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_categories.*

class Categories : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        categories_add_button.setOnClickListener(){
            val user=intent.getStringExtra("penis")
            val intent: Intent = Intent(this, AddCategory::class.java)
            intent.putExtra("penis", user)
            startActivity(intent)
        }


    }



}
