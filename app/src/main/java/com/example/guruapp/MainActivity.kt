package com.example.guruapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottom = findViewById<BottomNavigationView>(R.id.bottom)

        bottom.run {
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.tab_mypage -> {
                        val mypageFragment = fragmentMypage()
                        supportFragmentManager.beginTransaction().replace(R.id.container, mypageFragment).commit()
                    }
                    R.id.tab_record -> {
                        val calendarFragment = fragmentCalendar()
                        supportFragmentManager.beginTransaction().replace(R.id.container, calendarFragment).commit()
                    }
                    R.id.tab_friends -> {
                        val friendsFragment = fragmentFriends()
                        supportFragmentManager.beginTransaction().replace(R.id.container, friendsFragment).commit()
                    }
                }
                true
            }
            selectedItemId = R.id.tab_mypage
        }
    }
}