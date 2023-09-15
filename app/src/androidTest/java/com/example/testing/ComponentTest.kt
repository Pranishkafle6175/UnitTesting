package com.example.testing

import org.junit.Before
import org.junit.Test


class ComponentTest{
    private lateinit var component:Component


    //This function below the Before tag i.e setup runs every time for evry test cases
    @Before
    fun setup(){
        component=Component()
    }

    @Test
    fun resIdEqualsGivenString_returnsTrue(){

    }
}