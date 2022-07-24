package com.example.allclosedprgithub.util

import java.text.SimpleDateFormat
import java.util.*

object Helper {

     fun parseDateTime(date:String):String{

        val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()) // the initial pattern
        val formatter = SimpleDateFormat("dd MMMM yyyy, hh:mm a", Locale.getDefault()) // the desired output pattern

        val parse = parser.parse(date)
        return  formatter.format(parse!!)
    }

}