package com.marcos.navigationactivities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PersonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        bottomNavigationView = findViewById(R.id.buttomNavigationView);
        //definaindo o icone que vai começar selecionado no menu
        bottomNavigationView.setSelectedItemId(R.id.bottom_person);

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                //modificamos aqui
                R.id.bottom_search -> {
                    startActivity(Intent(applicationContext, SearchActivity::class.java))
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.bottom_person -> {
                    true
                }
                R.id.bottom_settings -> {
                    startActivity(Intent(applicationContext, SettingsActivity::class.java))
//                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                else -> false
            }
        }


    }
}