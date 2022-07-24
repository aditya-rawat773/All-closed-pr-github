package com.example.allclosedprgithub.util

import java.text.SimpleDateFormat
import java.util.*

object Helper {

     fun parseDateTime(date:String):String{

        val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault())
        val formatter = SimpleDateFormat("dd MMMM yyyy, hh:mm a", Locale.getDefault())

        val parse = parser.parse(date)
        return  formatter.format(parse!!)
    }

}