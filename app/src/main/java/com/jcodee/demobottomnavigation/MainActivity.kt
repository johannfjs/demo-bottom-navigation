package com.jcodee.demobottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.flContenedor, ItemFragment.newInstance("Pantalla 1"))
            .commit()

        bnvMenu.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_option1 -> {
                    Toast.makeText(this, "Pantalla 1", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.flContenedor, ItemFragment.newInstance("Pantalla 1"))
                        .commit()
                    true
                }
                R.id.nav_option2 -> {
                    Toast.makeText(this, "Pantalla 2", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.flContenedor, ItemFragment.newInstance("Pantalla 2"))
                        .commit()
                    true
                }
                R.id.nav_option3 -> {
                    Toast.makeText(this, "Pantalla 3", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.flContenedor, ItemFragment.newInstance("Pantalla 3"))
                        .commit()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}