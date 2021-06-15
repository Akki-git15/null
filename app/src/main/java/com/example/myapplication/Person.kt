package com.example.myapplication

class Person {
    var name:String? = null
    set(value){
        field = value?.toUpperCase()
    }
    var gender:String? = null
    var age:Int = 0
    set(value) = if(value<18) throw Exception("Person is Minor") else field=value
}
