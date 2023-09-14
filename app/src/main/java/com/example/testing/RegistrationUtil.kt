package com.example.testing

object RegistrationUtil {

    private val existinguser = listOf("Ram","Pranish","Hari")

    fun validregistration(
        name:String,
        password:String,
        confirmpassword:String
    ):Boolean{

        if(name.isEmpty()|| password.isEmpty()){
            return false
        }
        if(name in existinguser){
            return false
        }
        if(!(password==confirmpassword)){
            return false
        }
        if(password.count { it.isDigit()}<2){
            return false
        }
        return true
    }
}