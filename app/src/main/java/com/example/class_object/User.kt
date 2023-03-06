package com.example.class_object

class User(var name: String, var id: String, var age: Int) {

    fun addAge(years: Int = 10): String{
        age = age.plus(years)
        return "User name: $name User id: $id User age: $age"
    }

   // fun printUserInfo(){
   //     println("User name: $name User id: $id User age: $age")
  //  }
}