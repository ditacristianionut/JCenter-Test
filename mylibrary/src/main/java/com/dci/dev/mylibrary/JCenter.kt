package com.dci.dev.mylibrary

import android.util.Log

object JCenter {

    fun <T>whereAmI(clazz: Class<T>): String {
        val location = "You are in ${clazz.simpleName}"
        Log.e(this::class.java.simpleName, location)
        return location
    }

}