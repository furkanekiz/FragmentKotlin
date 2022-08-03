package com.furkanekiz.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class ACMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_main)
    }

    fun firstFragment(view: View) {
        supportFragmentManager.commit {
            replace<FRFirst>(R.id.fragmentContainer)
            setReorderingAllowed(true)
            addToBackStack(null)
        }

    }

    fun secondFragment(view: View) {
        supportFragmentManager.commit {
            replace<FRSecond>(R.id.fragmentContainer)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }
}