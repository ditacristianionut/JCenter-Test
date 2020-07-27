package com.dci.dev.secondlibrary

import android.content.Context
import android.widget.Toast

object SecondLibrary {

    fun hello(context: Context, name: String) {
        Toast.makeText(context, "Hello $name" , Toast.LENGTH_LONG).show()
    }

}