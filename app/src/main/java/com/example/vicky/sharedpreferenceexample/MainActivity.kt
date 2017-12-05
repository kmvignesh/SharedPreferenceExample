package com.example.vicky.sharedpreferenceexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mypreference = MyPreference(this)
        var loginCount = mypreference.getLoginCount(PREFERENCE_LOGIN_COUNT)
        loginCount++
        mypreference.setLoginCount(loginCount)
        tv_count.text = loginCount.toString()

    }
}
