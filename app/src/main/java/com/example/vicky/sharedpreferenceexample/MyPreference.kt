package com.example.vicky.sharedpreferenceexample

import android.content.Context

/**
 * Created by VickY on 2017-11-21.
 */

val PREFERENCE_NAME = "SharedPreferenceExample"
val PREFERENCE_LOGIN_COUNT = "LoginCount"

class MyPreference(context : Context){


    val preference = context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE)

    fun getLoginCount() : Int{
        return preference.getInt(PREFERENCE_LOGIN_COUNT,0)
    }

    fun getLoginCount(KEY : String) : Int{
        return preference.getInt(KEY,0)
    }

    fun setLoginCount(count:Int){
        val editor = preference.edit()
        editor.putInt(PREFERENCE_LOGIN_COUNT,count)
        editor.apply()
    }

}