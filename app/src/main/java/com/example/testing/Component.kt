package com.example.testing

import android.content.Context

class Component {
    fun check(context:Context,resId:Int,string:String):Boolean{
        return context.getString(resId)==string
    }
}