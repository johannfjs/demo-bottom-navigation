package com.jcodee.demobottomnavigation

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOption(getString(R.string.screen_1))

        bnvMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_option1 -> {
                    setOption(getString(R.string.screen_1))
                    true
                }
                R.id.nav_option2 -> {
                    setOption(getString(R.string.screen_2))
                    true
                }
                R.id.nav_option3 -> {
                    setOption(getString(R.string.screen_3))
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun setOption(screen: String) {
        Toast.makeText(this, screen, Toast.LENGTH_SHORT).show()
        supportFragmentManager.beginTransaction()
            .replace(R.id.flContenedor, ItemFragment.newInstance(screen))
            .commit()
    }
}